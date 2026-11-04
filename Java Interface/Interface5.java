//Employee Work
interface Employee {
    void work();
}

class Developer implements Employee {
    public void work() {
        System.out.println("Employee is developing software");
    }
}

public class Interface5 {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.work();
    }
}