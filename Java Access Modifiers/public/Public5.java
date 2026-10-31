//Public method returning a value
class Rectangle {

    public int area(int length, int width) {
        return length * width;
    }
}

public class Public5 {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        int result = r.area(10, 5);

        System.out.println("Area: " + result);
    }
}