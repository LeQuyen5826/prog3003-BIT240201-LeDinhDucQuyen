
package com.bai1;

public class Bai1 {

    public static <E> void printArray(E[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5};
        String[] strArr = {"Anna", "Peter", "Mary"};

        System.out.print("Integer[]: ");
        printArray(intArr);

        System.out.print("String[]:  ");
        printArray(strArr);
    }
}