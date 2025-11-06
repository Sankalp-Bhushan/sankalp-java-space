package SystemDesign.BehaviouralDesignPattern.StrategyPattern;

public class PaymentContext {

    private PaymentStrategy paymentStrategy;

    // Allows changing the strategy dynamically
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void payAmount(int amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment method selected!");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
