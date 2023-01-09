package strategy.strategies;

public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(MyPayStrategy strategy) {
        strategy.collectPaymentDetails();
    }

    public void processOrderUsingPayPal(PayByPayPal paypal) {
        paypal.collectPaymentDetails();
    }

    public void processOrderUsingCreditCard(PayByCreditCard creditCard) {
        creditCard.collectPaymentDetails();
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
