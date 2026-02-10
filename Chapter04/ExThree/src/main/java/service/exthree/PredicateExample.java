
package service.exthree;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        int a = 10;
        int b = 7;
        System.out.println(a + " là số chẵn? " + isEven.test(a));
        System.out.println(b + " là số chẵn? " + isEven.test(b));
    }
}