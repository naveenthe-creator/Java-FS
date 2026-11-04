//Employee Department
interface Employee {
    void department();
}

class Developer implements Employee {
    public void department() {
        System.out.println("Department: Software Development");
    }
}

public class Interface3 {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.department();
    }
}