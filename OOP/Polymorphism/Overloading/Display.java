
class Display {
    void show(int id) {
        System.out.println("ID: " + id);
    }

    void show(String name) {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Display obj = new Display();
        obj.show(101);
        obj.show("Naveen");
    }
}
