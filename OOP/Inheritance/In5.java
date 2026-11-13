//Multi-level Inheritance
class Person {
    void displayPerson() {
        System.out.println("Person details");
    }
}

class Employee5 extends Person {
    void displayEmployee() {
        System.out.println("Employee details");
    }
}

class Manager5 extends Employee5 {
    void displayManager() {
        System.out.println("Manager details");
    }
}

public class In5 {
    public static void main(String[] args) {
        Manager5 manager = new Manager5();

        manager.displayPerson();
        manager.displayEmployee();
        manager.displayManager();
    }
}