package Lab5ex2_4;

public class TestCase {
    public static void main(String[] args) {
        Customer custom1 = new Customer(88, "Tan Ah", 10);
        System.out.println(custom1);
        custom1.setDiscount(8);
        System.out.println(custom1);
        System.out.println("id is: " + custom1.getId());
        System.out.println("name is: " + custom1.getName());
        System.out.println("discount is: " + custom1.getDiscount());

        Invoice inv1 = new Invoice(101, custom1, 888.8);
        System.out.println(inv1);

        inv1.setAmount(999.9);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getId());
        System.out.println("customer is: " + inv1.getCustomer());
        System.out.println("amount is: " + inv1.getAmount());
        System.out.println("customer's id is: " + inv1.getCustomerID());
        System.out.println("customer's name is: " + inv1.getCustomerName());
        System.out.println("amount after discount is: " + inv1.getAmountAfterDiscount());
    }
}
