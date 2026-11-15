
class Number {
    void calculate(int a, int b) {
        System.out.println("Integer Sum: " + (a + b));
    }

    void calculate(double a, double b) {
        System.out.println("Decimal Sum: " + (a + b));
    }

    public static void main(String[] args) {
        Number obj = new Number();
        obj.calculate(10, 20);
        obj.calculate(10.5, 20.5);
    }
}
