//Public method with parameters
class Calculator {

    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }
}

public class Public4 {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        c.add(10, 20);
    }
}