import order.ShoppingCart;
import strategy.CreditCardPayment;
import strategy.PayPalPayment;

public class App {
    public static void main(String[] args) {
        
        ShoppingCart cart = new ShoppingCart();
        
        cart.setPaymentStrategy(new CreditCardPayment("1234567890123456", "Le Dinh Duc Quyen"));
        cart.checkout(850000);
        
        System.out.println("\n-----------------------------------\n");
        
        cart.setPaymentStrategy(new PayPalPayment("quyen.dev@gmail.com"));
        cart.checkout(1200000);
        
        System.out.println("\n-----------------------------------\n");
        
        cart.setPaymentStrategy(null);
        cart.checkout(500000);
    }
}