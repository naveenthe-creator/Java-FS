class StudentEncapsulation {

    private int marks;

    public void setMarks(int m) {
        marks = m;
    }

    public int getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        StudentEncapsulation s = new StudentEncapsulation();

        s.setMarks(90);
        System.out.println("Marks: " + s.getMarks());
    }
}