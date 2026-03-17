
package com.ex3;

import java.util.concurrent.*;

public class BankingSystem {

    public static void main(String[] args) {

        CompletableFuture<Boolean> auth = CompletableFuture.supplyAsync(() -> {
            sleep(2);
            System.out.println("Xác thực...");
            return true; 
        });

        CompletableFuture<Boolean> balance = auth.thenApplyAsync(result -> {
            sleep(2);
            if (!result) throw new RuntimeException("Xác thực thất bại");
            System.out.println("Kiểm tra số dư...");
            return true;
        });

        CompletableFuture<Void> transaction = balance.thenAcceptAsync(result -> {
            sleep(2);
            if (!result) throw new RuntimeException("Không đủ tiền");
            System.out.println("Chuyển tiền thành công!");
        });

        transaction.exceptionally(ex -> {
            System.out.println("Lỗi: " + ex.getMessage());
            return null;
        }).join();
    }

    private static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}