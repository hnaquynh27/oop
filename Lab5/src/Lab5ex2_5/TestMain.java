package Lab5ex2_5;

public class TestMain {
    public static void main(String[] args) {

        Customer cus = new Customer(13, "Ahn", 'm');
        System.out.println(cus);

        System.out.println("Customer's id: " + cus.getID());
        System.out.println("Customer's name: " + cus.getName());
        System.out.println("Customer's gender: " + cus.getGender());

        Account acc = new Account(20, cus, 10040);
        System.out.println(acc);

        acc.setBalance(13000.0);
        System.out.println("Account's id: " + acc.getId());
        System.out.println("Account's customer: " + acc.getCustomer());
        System.out.println("Account's balance: " + acc.getBalance());
        System.out.println("Account's customer's name: " + acc.getCustomer().getName());

        acc.deposit(5000.0);
        System.out.println(acc);
        acc.withdraw(9000.0);
        System.out.println(acc);
        acc.withdraw(12000.0);
    }
}
