//Default method
class Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

public class Default2 {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();
    }
}