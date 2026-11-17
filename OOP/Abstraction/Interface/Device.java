interface Control {
    void turnOn();
}

class Device implements Control {
    public void turnOn() {
        System.out.println("Device turned on");
    }

    public static void main(String[] args) {
        Device obj = new Device();
        obj.turnOn();
    }
}
