class BankAccount {

    String holder;
    double balance;

    BankAccount(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    void display() {
        System.out.println("Holder: " + holder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount("Naveen", 50000);
        b.display();
    }
}
