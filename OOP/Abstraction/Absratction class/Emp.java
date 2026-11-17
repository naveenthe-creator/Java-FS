
abstract class Employee {
    abstract void salary();
}

class Emp extends Employee {
    void salary() {
        System.out.println("Salary: 25000");
    }

    public static void main(String[] args) {
        Emp obj = new Emp();
        obj.salary();
    }
}
