//Protected inheritance
class Parent {
    protected int number = 100;
}

class Child extends Parent {

    void display() {
        System.out.println(number);
    }
}

public class Protected3 {
    public static void main(String[] args) {

        Child c = new Child();
        c.display();
    }
}