class Account {
    void accountDetails() {
        System.out.println("Account is active");
    }
}

class CurrentAccount extends Account {
    void withdraw() {
        System.out.println("Current account withdrawal");
    }
}

public class In6 {
    public static void main(String[] args) {
        CurrentAccount account = new CurrentAccount();

        account.accountDetails();
        account.withdraw();
    }
}