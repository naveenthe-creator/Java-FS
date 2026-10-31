//Accessing a public variable
class Student {

    public int age = 22;
}

public class Public1 {

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println("Student Age: " + s.age);
    }
}