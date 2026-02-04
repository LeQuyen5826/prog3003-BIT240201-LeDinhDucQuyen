
package service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class OrderProcessing {

    public static void main(String[] args) {
        System.out.println("[" + Thread.currentThread().getName() + "] Bắt đầu xử lý đơn hàng...");

        CompletableFuture<String> checkAvailability = CompletableFuture.supplyAsync(() -> {
            simulateDelay(2); 
            return "Sản phẩm còn hàng";
        }).thenApply(result -> {
            System.out.println("[" + Thread.currentThread().getName() + "] Tác vụ 1 hoàn thành: " + result);
            return result;
        });

        CompletableFuture<String> processPayment = CompletableFuture.supplyAsync(() -> {
            simulateDelay(3); 
            return "Thanh toán thành công";
        }).thenApply(result -> {
            System.out.println("[" + Thread.currentThread().getName() + "] Tác vụ 2 hoàn thành: " + result);
            return result;
        });

        CompletableFuture<String> shipOrder = CompletableFuture.supplyAsync(() -> {
            simulateDelay(4); 
            return "Đơn hàng đã được giao cho đơn vị vận chuyển";
        }).thenApply(result -> {
            System.out.println("[" + Thread.currentThread().getName() + "] Tác vụ 3 hoàn thành: " + result);
            return result;
        });

        CompletableFuture<Void> allTasks = CompletableFuture.allOf(
                checkAvailability,
                processPayment,
                shipOrder
        );

        allTasks.thenRun(() -> {
            System.out.println("\n[" + Thread.currentThread().getName() + "] TẤT CẢ TÁC VỤ HOÀN THÀNH!");
            System.out.println("Đơn hàng đã xử lý xong thành công. Cảm ơn quý khách!");
        });

        allTasks.join();
        System.out.println("Main thread kết thúc.");
    }

    private static void simulateDelay(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Bị interrupt: " + e.getMessage());
        }
    }
}
