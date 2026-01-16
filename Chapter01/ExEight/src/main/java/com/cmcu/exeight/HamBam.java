
package com.cmcu.exeight;

import java.util.HashMap;

public class HamBam {
    public static void main(String[] args) {
        HashMap<Integer, String> nhanVien = new HashMap<>();
        
        nhanVien.put(101, "Anna");
        nhanVien.put(102, "Peter");
        nhanVien.put(103, "Mary");
        System.out.println("Danh sach nhan vien sau khi them 3 nguoi:");
        System.out.println(nhanVien);
        
        String ten102 = nhanVien.get(102);
        System.out.println("\nNhan vien co ID 102 la: " + ten102);
        
        if (nhanVien.containsKey(105)) {
            System.out.println("ID 105 da ton tai: " + nhanVien.get(105));
        } else {
            System.out.println("ID 105 khong ton tai -> them moi voi ten \"Unknown\"");
            nhanVien.put(105, "Unknown");
        }
        System.out.println("\nDanh sach nhan vien cuoi cung:");
        System.out.println(nhanVien);
    }
}
