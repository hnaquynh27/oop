package strategy.strategies;

public interface PayStrategy {
    boolean pay(int paymantAmount);

    void collectPaymentDetails();
}
