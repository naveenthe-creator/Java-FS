class Parent {
    protected void display() {
        System.out.println("Protected Method");
    }
}

class Pro4 extends Parent {
    public static void main(String[] args) {
        Pro4 obj = new Pro4();
        obj.display();
    }
}