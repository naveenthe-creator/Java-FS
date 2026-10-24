public class Operator18 {
    public static void main(String[] args) {
        int a = 25;
        int b = 40;
        int c = 30;

        int largest = (a > b)
                ? (a > c ? a : c)
                : (b > c ? b : c);

        System.out.println("Largest: " + largest);
    }
}
