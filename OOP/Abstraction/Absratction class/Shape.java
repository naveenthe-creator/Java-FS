
abstract class Area {
    abstract void calculate();
}

class Shape extends Area {
    void calculate() {
        int length = 10;
        int width = 5;
        System.out.println("Area: " + length * width);
    }

    public static void main(String[] args) {
        Shape obj = new Shape();
        obj.calculate();
    }
}
