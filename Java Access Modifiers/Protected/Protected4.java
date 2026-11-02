//Protected method inheritance
class Animal {

    protected void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void display() {
        eat();
    }
}

public class Protected4 {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.display();
    }
}