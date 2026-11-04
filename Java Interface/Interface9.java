//Employee Designation
interface Employee {
    void designation();
}

class Developer implements Employee {
    public void designation() {
        System.out.println("Designation: Java Developer");
    }
}

public class Interface9 {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.designation();
    }
}