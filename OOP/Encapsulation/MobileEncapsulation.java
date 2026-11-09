class MobileEncapsulation {

    private String model;

    public void setModel(String m) {
        model = m;
    }

    public String getModel() {
        return model;
    }

    public static void main(String[] args) {
        MobileEncapsulation m = new MobileEncapsulation();

        m.setModel("Redmi Note 15 SE");
        System.out.println(m.getModel());
    }
}