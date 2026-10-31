//Private marks
class Student {
    private int marks = 85;

    public void showMarks() {
        System.out.println("Marks: " + marks);
    }
}

public class Private4 {
    public static void main(String[] args) {

        Student s = new Student();
        s.showMarks();
    }
}