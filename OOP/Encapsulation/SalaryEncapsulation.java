class SalaryEncapsulation {

    private double salary;

    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        SalaryEncapsulation s = new SalaryEncapsulation();

        s.setSalary(30000);
        System.out.println("Salary: " + s.getSalary());
    }
}