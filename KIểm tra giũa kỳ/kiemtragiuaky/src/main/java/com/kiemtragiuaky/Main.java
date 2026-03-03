package com.kiemtragiuaky;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Main {
    
    public static CompletableFuture<Double> calculateAverageGpa(List<Student> students) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);

                if (students == null || students.isEmpty()) {
                    throw new RuntimeException("Danh sách sinh viên rỗng!");
                }

                double total = students.stream()
                        .mapToDouble(Student::getGpa)
                        .sum();

                return total / students.size();

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Bị ngắt trong quá trình xử lý: " + e.getMessage());
            }
        });
    }

    public static void main(String[] args) {
        System.out.println("CÂU 1: Generic StudentManager");

        StudentManager<Student> manager = new StudentManager<>();

        manager.add(new Student("SV001", "Nguyen Van An",   3.8));
        manager.add(new Student("SV002", "Tran Thi Bich",  3.1));
        manager.add(new Student("SV003", "Le Van Cuong",   3.5));
        manager.add(new Student("SV004", "Pham Thi Dung",  2.9));
        manager.add(new Student("SV005", "Hoang Van Em",   3.6));

        System.out.println("Danh sach sinh vien:");
        manager.getAll().forEach(System.out::println);

        
        System.out.println("Tinh GPA trung binh bat dong bo");

        List<Student> students = manager.getAll();

        calculateAverageGpa(students)
                .thenAccept(avg -> {
                    System.out.printf("Diem trung binh GPA cua he thong la: %.2f%n", avg);
                })
                .exceptionally(ex -> {
                    System.err.println("Loi trong qua trinh tinh toan: " + ex.getMessage());
                    return null;
                });

        System.out.println("[Luong chinh] Dang xu ly bat dong bo, chuong trinh tiep tuc...");

      
        System.out.println("CÂU 3: Stream API - loc va sap xep");

        
        students.stream()                                              
                .filter(s -> s.getGpa() >= 3.2)                      
                .sorted((s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa())) 
                .forEach(System.out::println);                         

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n[Chuong trinh ket thuc]");
    }
}
