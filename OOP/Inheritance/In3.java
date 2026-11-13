class BankAccount {
    double balance = 50000;

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Interest: " + interest);
    }
}

public class In3 {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();

        account.checkBalance();
        account.calculateInterest();
    }
}