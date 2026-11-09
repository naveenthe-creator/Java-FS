class BankEncapsulation {

    private double balance;

    public void setBalance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankEncapsulation b = new BankEncapsulation();

        b.setBalance(50000);
        System.out.println("Balance: " + b.getBalance());
    }
}