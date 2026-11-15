
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car engine started");
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.start();
    }
}
