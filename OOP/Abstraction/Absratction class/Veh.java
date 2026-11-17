
abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Veh extends Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }

    public static void main(String[] args) {
        Veh obj = new Veh();
        obj.start();
        obj.stop();
    }
}
