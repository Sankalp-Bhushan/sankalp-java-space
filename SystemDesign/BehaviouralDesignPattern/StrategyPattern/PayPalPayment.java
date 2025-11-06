package SystemDesign.BehaviouralDesignPattern.StrategyPattern;

public class PayPalPayment implements PaymentStrategy {

    private String emailId;

    public PayPalPayment(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using PayPal account [" + emailId + "]");
    }
}
