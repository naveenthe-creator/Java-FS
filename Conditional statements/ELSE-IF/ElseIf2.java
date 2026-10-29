//Find the Greatest of Three Numbers
public class ElseIf2 {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        int c = 10;

        if (a >= b && a >= c) {
            System.out.println("A is greatest");
        } else if (b >= a && b >= c) {
            System.out.println("B is greatest");
        } else {
            System.out.println("C is greatest");
        }
    }
}