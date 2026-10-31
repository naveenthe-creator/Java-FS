//Private variable
class Student {
    private int age = 21;

    public void display() {
        System.out.println(age);
    }
}

public class Private1 {
    public static void main(String[] args) {

        Student s = new Student();
        s.display();
    }
}