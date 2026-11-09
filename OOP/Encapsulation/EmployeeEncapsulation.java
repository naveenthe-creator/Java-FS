class EmployeeEncapsulation {

    private String name = "Naveen";

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        EmployeeEncapsulation emp = new EmployeeEncapsulation();

        emp.setName("Rahul");
        System.out.println(emp.getName());
    }
}