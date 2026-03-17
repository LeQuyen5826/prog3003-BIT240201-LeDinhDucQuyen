
package com.ex2;

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng Credit Card");
    }
}

class PayPalPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng PayPal");
    }
}

class CashPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng Cash");
    }
}

class PaymentFactory {
    public static Payment getPayment(String type) {
        switch (type.toLowerCase()) {
            case "credit": return new CreditCardPayment();
            case "paypal": return new PayPalPayment();
            case "cash": return new CashPayment();
            default: throw new IllegalArgumentException("Không hợp lệ");
        }
    }
}

public class MainPayment {
    public static void main(String[] args) {
        Payment p1 = PaymentFactory.getPayment("credit");
        p1.pay(100);

        Payment p2 = PaymentFactory.getPayment("paypal");
        p2.pay(200);

        Payment p3 = PaymentFactory.getPayment("cash");
        p3.pay(50);
    }
}