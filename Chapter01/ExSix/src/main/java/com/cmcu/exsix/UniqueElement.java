/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cmcu.exsix;

import java.util.HashSet;
import java.util.Set;

public class UniqueElement {

    public static void main(String[] args) {
        
        Integer[] array = {5, 2, 9, 2, 5, 8, 1};
        
        System.out.println("Mang ban dau:");
        for (Integer num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); 
        
        Set<Integer> uniqueSet = new HashSet<>();
        
        for (Integer num : array) {
            uniqueSet.add(num);
        }
        
        System.out.println("Cac phan tu duy nhat sau khi dung HashSet:");
        for (Integer num : uniqueSet) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("\nGiai thich:");
        System.out.println("// HashSet khong duy tri thu tu chen cua cac phan tu.");
        System.out.println("// No su dung ham bam(hash code) de luu tru, nen thu tu");
        System.out.println("// khi duyet thuong khong giong thu tu ban dau.");
        System.out.println("// Neu can giu nguyen thu tu,nen dung LinkedHashSet thay vi HashSet.");
    }
}
