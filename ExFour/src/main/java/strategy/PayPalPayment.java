package strategy;

public class PayPalPayment implements PaymentStrategy {
    
    private String email;
    
    public PayPalPayment(String email) {
        this.email = email;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println("Thanh toán " + amount + " VND qua PayPal");
        System.out.println("  Tài khoản: " + email);
        System.out.println("→ Xác nhận thanh toán qua PayPal thành công!");
    }
}