//Employee experience
interface Employee {
    void experience();
}

class Developer implements Employee {
    public void experience() {
        System.out.println("Experience: 2 Years");
    }
}

public class Interface7 {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.experience();
    }
}