//Student details
class Student {
    int id = 101;
    String name = "Rahul";
    String course = "Java Full Stack";

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}