class BookEncapsulation {

    private double price;

    public void setPrice(double p) {
        price = p;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        BookEncapsulation b = new BookEncapsulation();

        b.setPrice(450);
        System.out.println("Price: " + b.getPrice());
    }
}