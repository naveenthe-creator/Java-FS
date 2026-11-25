//Replace
class Sb5 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello Java");
        s.replace(6, 10, "World");
        System.out.println(s);
    }
}