class ProductEncapsulation {

    private String productName;

    public void setProductName(String n) {
        productName = n;
    }

    public String getProductName() {
        return productName;
    }

    public static void main(String[] args) {
        ProductEncapsulation p = new ProductEncapsulation();

        p.setProductName("Laptop");
        System.out.println(p.getProductName());
    }
}