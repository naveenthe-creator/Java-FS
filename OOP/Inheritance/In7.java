class Product {
    String name = "Laptop";
    double price = 55000;
}

class ElectronicProduct extends Product {
    void displayDetails() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Category: Electronics");
    }
}

public class In7 {
    public static void main(String[] args) {
        ElectronicProduct product = new ElectronicProduct();
        product.displayDetails();
    }
}