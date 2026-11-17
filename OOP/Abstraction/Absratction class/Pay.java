
abstract class Payment {
    abstract void process();

    void status() {
        System.out.println("Payment processing");
    }
}

class Pay extends Payment {
    void process() {
        System.out.println("Payment successful");
    }

    public static void main(String[] args) {
        Pay obj = new Pay();
        obj.status();
        obj.process();
    }
}
