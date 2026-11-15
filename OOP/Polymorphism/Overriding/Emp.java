class Emp {
    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Emp {
    @Override
    void work() {
        System.out.println("Developer is writing code");
    }

    public static void main(String[] args) {
        Developer obj = new Developer();
        obj.work();
    }
}
