//Multiple Objects
class Product {
    String name;
    int price;

    void display() {
        System.out.println(name + " - " + price);
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.name = "Laptop";
        p1.price = 50000;

        Product p2 = new Product();
        p2.name = "Mobile";
        p2.price = 20000;

        p1.display();
        p2.display();
    }
}