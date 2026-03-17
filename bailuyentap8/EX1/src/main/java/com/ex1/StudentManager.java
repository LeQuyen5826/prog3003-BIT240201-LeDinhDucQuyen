
package com.ex1;

import java.util.*;

class Student {
    private String mssv;
    private String name;
    private double gpa;

    public Student(String mssv, String name, double gpa) {
        this.mssv = mssv;
        this.name = name;
        this.gpa = gpa;
    }

    public String getMssv() {
        return mssv;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("MSSV: " + mssv + ", Tên: " + name + ", GPA: " + gpa);
    }
}

public class StudentManager {
    private static ArrayList<Student> list = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Tim theo ten");
            System.out.println("4. Xoa theo MSSV");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: displayList(); break;
                case 3: searchByName(); break;
                case 4: deleteByMssv(); break;
                case 0: return;
                default: System.out.println("Sai lua chon!");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Nhap MSSV: ");
        String mssv = sc.nextLine();

        System.out.print("Nhap ten: ");
        String name = sc.nextLine();

        System.out.print("Nhap GPA: ");
        double gpa = sc.nextDouble();
        sc.nextLine();

        list.add(new Student(mssv, name, gpa));
        System.out.println("Đa them!");
    }

    private static void displayList() {
        if (list.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }
        for (Student s : list) {
            s.display();
        }
    }

    private static void searchByName() {
        System.out.print("Nhap ten can tim: ");
        String name = sc.nextLine();

        for (Student s : list) {
            if (s.getName().toLowerCase().contains(name.toLowerCase())) {
                s.display();
            }
        }
    }

    private static void deleteByMssv() {
        System.out.print("Nhap MSSV can xoa: ");
        String mssv = sc.nextLine();

        list.removeIf(s -> s.getMssv().equals(mssv));
        System.out.println("Đa xoa (neu ton tai)!");
    }
}