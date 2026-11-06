//Constructor with salary calculation
class EmployeeSalary {

    String name;
    double basicSalary;

    EmployeeSalary(String name, double salary) {
        this.name = name;
        basicSalary = salary;
    }

    void calculateAnnualSalary() {
        System.out.println("Annual Salary: " + (basicSalary * 12));
    }

    public static void main(String[] args) {
        EmployeeSalary e = new EmployeeSalary("Naveen", 30000);
        e.calculateAnnualSalary();
    }
}