
abstract class Account {
    abstract void deposit();

    void type() {
        System.out.println("Savings Account");
    }
}

class Bank extends Account {
    void deposit() {
        System.out.println("Amount deposited");
    }

    public static void main(String[] args) {
        Bank obj = new Bank();
        obj.type();
        obj.deposit();
    }
}
