class CarEncapsulation {

    private String brand;

    public void setBrand(String b) {
        brand = b;
    }

    public String getBrand() {
        return brand;
    }

    public static void main(String[] args) {
        CarEncapsulation c = new CarEncapsulation();

        c.setBrand("BMW");
        System.out.println(c.getBrand());
    }
}