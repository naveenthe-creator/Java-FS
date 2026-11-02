//Default inheritance
class Parent {
    int number = 50;
}

class Child extends Parent {

    void display() {
        System.out.println(number);
    }
}

public class Default5 {
    public static void main(String[] args) {

        Child c = new Child();
        c.display();
    }
}