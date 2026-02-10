
package service.exfour;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        List<String> moneyStrings = Arrays.asList("$10", "$20", "$50");
        
        Function<String, Integer> moneyFunc =
                s -> Integer.parseInt(s.substring(1));
        
        List<Integer> moneyNumbers = moneyStrings.stream()
                .map(moneyFunc)
                .collect(Collectors.toList());

        System.out.println(moneyNumbers);
    }
}
