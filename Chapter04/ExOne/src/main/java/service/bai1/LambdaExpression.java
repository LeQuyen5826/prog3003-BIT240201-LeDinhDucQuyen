
package service.bai1;

public class LambdaExpression {
    public static void main(String[] args) {

        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> {
            if (b == 0) {
                System.out.println("Không thể chia cho 0");
                return 0;
            }
            return a / b;
        };

        System.out.println("10 + 5 = " + add.compute(10, 5));
        System.out.println("10 - 5 = " + subtract.compute(10, 5));
        System.out.println("10 * 5 = " + multiply.compute(10, 5));
        System.out.println("10 / 5 = " + divide.compute(10, 5));
    }
}