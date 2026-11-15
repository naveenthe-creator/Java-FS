
class Student {
    void display(String name) {
        System.out.println("Name: " + name);
    }

    void display(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.display("Naveen");
        obj.display("Naveen", 22);
    }
}
