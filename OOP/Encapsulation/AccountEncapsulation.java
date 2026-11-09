class AccountEncapsulation {

    private long accountNumber;

    public void setAccountNumber(long n) {
        accountNumber = n;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public static void main(String[] args) {
        AccountEncapsulation a = new AccountEncapsulation();

        a.setAccountNumber(123456789);
        System.out.println(a.getAccountNumber());
    }
}