class CompanyEncapsulation {

    private String companyName;

    public void setCompanyName(String n) {
        companyName = n;
    }

    public String getCompanyName() {
        return companyName;
    }

    public static void main(String[] args) {
        CompanyEncapsulation c = new CompanyEncapsulation();

        c.setCompanyName("Infosys");
        System.out.println(c.getCompanyName());
    }
}