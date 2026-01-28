package strategy;

public class CreditCardPayment implements PaymentStrategy {
    
    private String cardNumber;
    private String cardHolderName;
    
    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println("Thanh toán " + amount + " VND qua Credit Card");
        System.out.println("  Chủ thẻ: " + cardHolderName);
        System.out.println("  Số thẻ: **** **** **** " + 
            (cardNumber.length() >= 4 ? cardNumber.substring(cardNumber.length() - 4) : cardNumber));
        System.out.println("→ Thanh toán thành công!");
    }
}
