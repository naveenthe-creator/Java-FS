//Protected string
class Student {
    protected String name = "Naveen";
}

class Details extends Student {

    void display() {
        System.out.println(name);
    }
}

public class Protected5 {
    public static void main(String[] args) {

        Details d = new Details();
        d.display();
    }
}