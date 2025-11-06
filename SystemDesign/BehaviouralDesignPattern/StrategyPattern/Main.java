package SystemDesign.BehaviouralDesignPattern.StrategyPattern;

public class Main {
    public static void main(String[] args) {

        PaymentContext paymentContext = new PaymentContext();

        // Pay using Credit Card
        paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9876", "Sankalp Bhushan"));
        paymentContext.payAmount(1200);

        // Pay using PayPal
        paymentContext.setPaymentStrategy(new PayPalPayment("sankalp@example.com"));
        paymentContext.payAmount(450);

        // Pay using UPI
        paymentContext.setPaymentStrategy(new UPIPayment("sankalp@oksbi"));
        paymentContext.payAmount(300);
    }
}
