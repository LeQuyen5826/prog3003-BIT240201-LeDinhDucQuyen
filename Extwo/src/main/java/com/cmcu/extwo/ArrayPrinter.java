
package com.cmcu.extwo;

public class ArrayPrinter {

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        // Kiểm thử với mảng Integer
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Mang Integer:");
        printArray(intArray);

        String[] stringArray = {"Xin chao", "day", "la", "Java"};
        System.out.println("Mang String:");
        printArray(stringArray);
        
    }
}