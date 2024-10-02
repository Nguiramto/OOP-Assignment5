

public class Branch2 extends Brancch1 {

    int weight= 800;
    double height= 1000;

    public Branch2(String FirstName, String LastName, int Age, String Gender, int Phone) {
        super(FirstName, LastName, Age, Gender, Phone);
    }


    @Override
    public void dispalyInfo() {
        super.dispalyInfo();
    }

    public void displayBranch2Info () {
        System.out.println("Weight is : " + weight);
        System.out.println("Height is : " + height);
    }
}
