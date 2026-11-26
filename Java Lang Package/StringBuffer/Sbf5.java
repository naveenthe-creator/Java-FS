class Sbf5 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello Java");
        s.replace(6, 10, "World");
        System.out.println(s);
    }
}