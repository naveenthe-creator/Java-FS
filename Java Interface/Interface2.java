//Employee Salary
interface Employee {
    void salary();
}

class Developer implements Employee {
    public void salary() {
        System.out.println("Developer Salary: 30000");
    }
}

public class Interface2 {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.salary();
    }
}