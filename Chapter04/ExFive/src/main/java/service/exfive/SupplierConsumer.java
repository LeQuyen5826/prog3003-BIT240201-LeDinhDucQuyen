
package service.exfive;

import java.util.function.Supplier;
import java.util.function.Consumer;

public class SupplierConsumer {
    public static void main(String[] args) {

        Supplier<Double> randomSupplier = () -> Math.random() * 100;

        Consumer<Double> printConsumer =
                number -> System.out.println("Số may mắn: " + number);

        Double luckyNumber = randomSupplier.get();
        printConsumer.accept(luckyNumber);
    }
}