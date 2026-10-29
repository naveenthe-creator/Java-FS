//Simple Traffic Signal
public class ElseIf4 {
    public static void main(String[] args) {
        String signal = "Yellow";

        if (signal.equals("Red")) {
            System.out.println("Stop");
        } else if (signal.equals("Yellow")) {
            System.out.println("Get ready");
        } else if (signal.equals("Green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid signal");
        }
    }
}