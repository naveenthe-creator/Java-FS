
interface Employee {
    void role();
}

class Staff implements Employee {
    public void role() {
        System.out.println("Software Developer");
    }

    public static void main(String[] args) {
        Staff obj = new Staff();
        obj.role();
    }
}
