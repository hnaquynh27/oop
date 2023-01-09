package builder.exercise;

public class BankAccount {
    private final String name;
    private final String accNumber;
    private final String address;
    private final String email;
    private final boolean newsletter;
    private final boolean mobileBanking;

    public BankAccount(String name, String accNumber, String address, String email, boolean newsletter, boolean mobileBanking) {
        this.name = name;
        this.accNumber = accNumber;
        this.address = address;
        this.email = email;
        this.newsletter = newsletter;
        this.mobileBanking = mobileBanking;
    }

    public static class BankAccountBuilder {
        private String name;
        private String accNumber;
        private String address;
        private String email;
        private boolean newsletter;
        private boolean mobileBanking;

        public BankAccountBuilder(String name, String accNumber) {
            this.name = name;
            this.accNumber = accNumber;
        }

        public BankAccountBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public BankAccountBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public BankAccountBuilder setNewsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this;
        }

        public BankAccountBuilder setMobileBanking(boolean mobileBanking) {
            this.mobileBanking = mobileBanking;
            return this;
        }

        public BankAccount build() {
            BankAccount bankAcc = new BankAccount(this.name, this.accNumber, this.address, this.email, this.newsletter, this.mobileBanking);
            return bankAcc;
        }
    }

    public String toString() {
        return "BankAccount[name=" + name + ", accNumber=" + accNumber + ", address=" + address + ", email=" + email + ", newsletter=" + newsletter + ", mobileBanking=" + mobileBanking + "]";
    }
}
