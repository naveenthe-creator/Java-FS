//Private variable with setter
class Person {
    private String name;

    public void setName(String n) {
        name = n;
    }

    public void display() {
        System.out.println(name);
    }
}

public class Private5 {
    public static void main(String[] args) {

        Person p = new Person();

        p.setName("Naveen");
        p.display();
    }
}
