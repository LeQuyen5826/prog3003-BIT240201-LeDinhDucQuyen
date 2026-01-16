

package com.cmcu.exseven;

import java.util.TreeSet;

public class Tree {

    public static void main(String[] args) {
        
        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");
        
        System.out.println("Danh sach cac ten trong TreeSet sau khi sap xep:");
        for (String name : names) {
            System.out.println(name);
        }
        
        String dauTien = names.first();
        String cuoiCung = names.last();
        System.out.println("\nPhan tu dau tien (nho nhat): " + dauTien);
        System.out.println("Phan tu cuoi cung (lon nhat): " + cuoiCung);
    }
}
