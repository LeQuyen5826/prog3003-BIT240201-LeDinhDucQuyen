
package com.cmcu.exnine;

import java.util.TreeMap;
import java.util.NavigableMap;

public class ExNine {

    public static void main(String[] args) {
        
        TreeMap<String, Double> sanPham = new TreeMap<>();
        sanPham.put("Laptop", 1500.0);
        sanPham.put("Mouse", 25.0);
        sanPham.put("Keyboard", 50.0);
        System.out.println("Danh sach san pham sap xep theo ten:");
        for (String ten : sanPham.keySet()) {
            System.out.println(ten + " : " + sanPham.get(ten));
        }
        
        NavigableMap<String, Double> sub = sanPham.subMap("K", true, "N", false);
        System.out.println("\nSan pham co ten bat dau tu K den truoc N (K den M):");
        for (String ten : sub.keySet()) {
            System.out.println(ten + " : " + sub.get(ten));
        }
    }
}
