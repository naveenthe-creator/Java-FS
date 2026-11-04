//Employee Project
interface Employee {
    void project();
}

class Developer implements Employee {
    public void project() {
        System.out.println("Project: Parking Management System");
    }
}

public class Interface10 {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.project();
    }
}