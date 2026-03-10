
package com.bai3;

import java.util.concurrent.CompletableFuture;

public class Bai3 {

    static CompletableFuture<String> xacThucKhachHang(String tenKhach) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("[Thread: " + Thread.currentThread().getName()
                    + "] Dang xac thuc khach hang: " + tenKhach + "...");
            try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
            System.out.println("Xac thuc thanh cong: " + tenKhach);
            return "KhachHang:" + tenKhach;
        });
    }

    static CompletableFuture<String> xuatVe(String tenPhim) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("[Thread: " + Thread.currentThread().getName()
                    + "] Dang xuat ve cho phim: " + tenPhim + "...");
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            System.out.println("Xuat ve thanh cong: " + tenPhim);
            return "Ve:" + tenPhim;
        });
    }

    public static void main(String[] args) {
        System.out.println("BAT DAU HE THONG THONG DAT VE");

        CompletableFuture<String> futureKhach = xacThucKhachHang("Nguyen Van A");
        CompletableFuture<String> futureVe    = xuatVe("Avengers: EndGame");

        CompletableFuture<String> ketQua = futureKhach.thenCombine(futureVe,
                (khach, ve) -> " DAT VE HOAN TAT: " + khach + " | " + ve
        );

        System.out.println(ketQua.join());
    }
}