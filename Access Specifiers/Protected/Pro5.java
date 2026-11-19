class Employee {
    protected int salary = 30000;
}

class Pro5 extends Employee {
    public static void main(String[] args) {
        Pro5 obj = new Pro5();
        System.out.println(obj.salary);
    }
}