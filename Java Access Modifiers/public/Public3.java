//Public variable and method
class Car {

    public String brand = "BMW";

    public void show() {
        System.out.println("Car Brand: " + brand);
    }
}

public class Public3 {

    public static void main(String[] args) {

        Car c = new Car();

        System.out.println(c.brand);
        c.show();
    }
}