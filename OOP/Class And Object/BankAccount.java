//Bank Account
class BankAccount {
    String accountHolder = "Naveen";
    double balance = 50000;

    void displayBalance() {
        System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.displayBalance();
    }
}