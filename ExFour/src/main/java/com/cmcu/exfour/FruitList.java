
package com.cmcu.exfour;
import java.util.ArrayList;

public class FruitList {
    
    public static void main(String[] args) {
        
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Danh sach ban dau: " + fruits);
        
        fruits.add(1, "Mango");
        System.out.println("Sau khi them Mango vao index1: " + fruits);
        
        int index = fruits.indexOf("Banana");
        if (index != -1) {
            fruits.set(index, "Grapes");
        }
        System.out.println("Sau khi thay Banana bang Grapes: " + fruits);
        
        boolean containsApple = fruits.contains("Apple");
        System.out.println("Danh sach co chua \"Apple\" khong? " + containsApple);
        System.out.println("Danh sach cuoi cung: " + fruits);
    }

}
