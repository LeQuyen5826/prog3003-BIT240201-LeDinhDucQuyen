package service.main;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {

        CompletableFuture<int[]> futureArray = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(800); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            int[] data = {1, 2, 5, 3, 100};
            System.out.println("Đã tạo mảng: " + Arrays.toString(data));
            return data;
        });

        CompletableFuture<int[]> futureOddSorted = futureArray.thenApply(arr -> {
            int[] oddSorted = Arrays.stream(arr)
                    .filter(n -> n % 2 == 1)           
                    .sorted()                          
                    .toArray();

            System.out.println("Số lẻ sau khi sắp xếp: " + Arrays.toString(oddSorted));
            return oddSorted;
        });

        CompletableFuture<String> futureMessage = futureOddSorted.thenApply(sortedOdd -> {
            String result = "Kết quả là: " + Arrays.toString(sortedOdd);
            return result;
        });

        futureMessage.thenAccept(finalMessage -> {
            System.out.println("\n" + finalMessage);
        });

        try {
            Thread.sleep(1500);  
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main thread kết thúc.");
    }
}

