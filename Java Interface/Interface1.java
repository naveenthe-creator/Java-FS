//Employee Details
interface Employee {
    void display();
}

class Developer implements Employee {
    public void display() {
        System.out.println("Employee: Naveen");
        System.out.println("Role: Developer");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.display();
    }
}