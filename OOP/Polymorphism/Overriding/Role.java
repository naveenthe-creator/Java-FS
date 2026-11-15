class EmployeeRole {
    void role() {
        System.out.println("General employee");
    }
}

class Manager extends EmployeeRole {
    @Override
    void role() {
        System.out.println("Managing the team");
    }

    public static void main(String[] args) {
        Manager obj = new Manager();
        obj.role();
    }
}
