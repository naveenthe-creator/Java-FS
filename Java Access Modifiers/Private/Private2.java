//Private method
class Animal {

    private void sound() {
        System.out.println("Cat meows");
    }

    public void display() {
        sound();
    }
}

public class Private2 {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.display();
    }
}