//Employee ID
interface Employee {
    void employeeId();
}

class Developer implements Employee {
    public void employeeId() {
        System.out.println("Employee ID: 101");
    }
}

public class Interface6 {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.employeeId();
    }
}