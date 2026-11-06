//Department details
class Department {

    int departmentId;
    String departmentName;

    Department(int id, String name) {
        departmentId = id;
        departmentName = name;
    }

    void display() {
        System.out.println(departmentId);
        System.out.println(departmentName);
    }

    public static void main(String[] args) {
        Department d = new Department(10, "IT");
        d.display();
    }
}