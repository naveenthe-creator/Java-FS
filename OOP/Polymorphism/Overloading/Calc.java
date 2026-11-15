
class Calc {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.add(10, 20);
        obj.add(10, 20, 30);
    }
}
