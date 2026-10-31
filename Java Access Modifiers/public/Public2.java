//Accessing a public method
class Employee {

    public void display() {
        System.out.println("Employee Details");
    }
}

public class Public2 {

    public static void main(String[] args) {

        Employee e = new Employee();

        e.display();
    }
}