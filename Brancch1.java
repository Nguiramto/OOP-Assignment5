

public class Brancch1 extends Root {

    String emailAddress ="douglasmbainaissem05@gamil.com";
    int roomNumber =302;


    public Brancch1(String FirstName, String LastName, int Age, String Gender, int Phone) {
        super(FirstName, LastName, Age, Gender, Phone);
    }

    @Override
    public void dispalyInfo() {
        super.dispalyInfo();
    }

    public void displayBranch1Info () {
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Room Number: " + roomNumber);
    }
}
