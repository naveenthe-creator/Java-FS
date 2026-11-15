class Pay {
    void process() {
        System.out.println("Processing payment");
    }
}

class UpiPayment extends Pay {
    @Override
    void process() {
        System.out.println("UPI payment successful");
    }

    public static void main(String[] args) {
        UpiPayment obj = new UpiPayment();
        obj.process();
    }
}
