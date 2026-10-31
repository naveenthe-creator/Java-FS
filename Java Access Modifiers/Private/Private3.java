// Private name
class Employee {
    private String name = "Naveen";

    public String getName() {
        return name;
    }
}

public class Private3 {
    public static void main(String[] args) {

        Employee e = new Employee();
        System.out.println(e.getName());
    }
}