package com.cmcu.chapter1;


public class Test<T> {
    private T value;

    public void set(T t) {
        this.value = t;
    }

    public T get() {
        return this.value;
    }

    public static void main(String[] args) {
        Test<Integer> intTest = new Test<>();
        intTest.set(58);
        System.out.println("So yeu thich: " + intTest.get());

        Test<String> stringTest = new Test<>();
        stringTest.set("My name is Quyen");
        System.out.println("Gioi thieu: " + stringTest.get());
    }
}
