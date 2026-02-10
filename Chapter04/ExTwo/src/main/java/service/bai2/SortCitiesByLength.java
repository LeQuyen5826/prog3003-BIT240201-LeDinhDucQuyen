
package service.bai2;

import java.util.*;

public class SortCitiesByLength {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList(
                "Hanoi",
                "Ho Chi Minh",
                "Da Nang",
                "Hue"
        );

        Collections.sort(cities, (c1, c2) -> c1.length() - c2.length());

        System.out.println(cities);
    }
}