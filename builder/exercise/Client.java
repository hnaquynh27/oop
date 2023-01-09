package builder.exercise;

public class Client {
    public static void main(String[] args) {
        BankAccount newAcc = new BankAccount.BankAccountBuilder("OOPBank", "0744235087").setEmail("contact@oopbank.com").setNewsletter(true).build();
        System.out.println(newAcc);
    }
}
