


public class Branch3 extends Root{

    String country= "Chad";
    int sponsorContact= 785782765;



    public Branch3(String FirstName, String LastName, int Age, String Gender, int Phone) {
        super(FirstName, LastName, Age, Gender, Phone);
    }

    @Override
    public void dispalyInfo() {
        super.dispalyInfo();
    }

    public void displayBranch3Info() {
        System.out.println("Country: " + country);
        System.out.println("Sponsor Contact: " + sponsorContact);
    }
}
