//Employee Location
interface Employee {
    void location();
}

class Developer implements Employee {
    public void location() {
        System.out.println("Location: Bangalore");
    }
}

public class Interface8 {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.location();
    }
}