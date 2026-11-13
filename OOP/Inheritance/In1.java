//single Inheritance
class Employee {
    String name = "Naveen";
    double salary = 30000;

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    void displayManager() {
        System.out.println("Role: Manager");
    }
}

public class In1 {
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.displayEmployee();
        manager.displayManager();
    }
}