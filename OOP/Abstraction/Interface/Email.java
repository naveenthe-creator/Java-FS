
interface Mail {
    void send();
}

class Email implements Mail {
    public void send() {
        System.out.println("Email sent successfully");
    }

    public static void main(String[] args) {
        Email obj = new Email();
        obj.send();
    }
}
