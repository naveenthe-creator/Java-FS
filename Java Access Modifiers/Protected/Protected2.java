//Protected method
class Animal {

    protected void sound() {
        System.out.println("Lion roars");
    }
}

public class Protected2 {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();
    }
}