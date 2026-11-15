
class Area {
    void area(int side) {
        System.out.println("Square: " + side * side);
    }

    void area(int length, int width) {
        System.out.println("Rectangle: " + length * width);
    }

    public static void main(String[] args) {
        Area obj = new Area();
        obj.area(5);
        obj.area(10, 5);
    }
}
