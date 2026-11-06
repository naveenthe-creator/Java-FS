//Recatangle Area
class Rectangle {
    int length = 10;
    int breadth = 5;

    void calculateArea() {
        System.out.println("Area: " + (length * breadth));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.calculateArea();
    }
}