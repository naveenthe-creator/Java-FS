class Notification {
    void send() {
        System.out.println("Sending notification");
    }
}

class EmailNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending email notification");
    }

    public static void main(String[] args) {
        EmailNotification obj = new EmailNotification();
        obj.send();
    }
}
