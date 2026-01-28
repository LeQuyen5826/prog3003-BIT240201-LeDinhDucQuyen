package order;

import strategy.PaymentStrategy;

public class ShoppingCart {
    
    private PaymentStrategy paymentStrategy;
    
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    
    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("Lỗi: Vui lòng chọn phương thức thanh toán trước khi thanh toán!");
            return;
        }
        
        System.out.println("Tổng tiền cần thanh toán: " + amount + " VND");
        paymentStrategy.pay(amount);
        System.out.println("Cảm ơn bạn đã mua sắm!");
    }
}