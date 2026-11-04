//Employee Attendance
interface Employee {
    void attendance();
}

class Developer implements Employee {
    public void attendance() {
        System.out.println("Attendance: Present");
    }
}

public class Interface4 {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.attendance();
    }
}