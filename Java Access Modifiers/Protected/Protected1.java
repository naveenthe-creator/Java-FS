//Protected variable
class Student {
    protected int age = 22;
}

public class Protected1 {
    public static void main(String[] args) {

        Student s = new Student();
        System.out.println(s.age);
    }
}