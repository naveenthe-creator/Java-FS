interface Banking {
    void withdraw();
}

class ATM implements Banking {
    public void withdraw() {
        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.withdraw();
    }
}
