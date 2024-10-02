
public class Test {


    public static void main(String[] args) {
        Brancch1 brancch1 = new Brancch1("Douglas","Omar", 22, "Male", 785782765);
        System.out.println("Single Inheritance");
        brancch1.dispalyInfo();
        brancch1.displayBranch1Info();

        Branch2 branch2 = new Branch2("Kessely", "Chloe", 25, "Female",63009639);
        System.out.println("Multiple Inheritance");
        branch2.dispalyInfo();
        branch2.displayBranch2Info();

        Branch3 branch3 = new Branch3("Francesca","Siguei",23, "Female", 62845683);
        System.out.println("Multiple Inheritance");
        branch3.dispalyInfo();
        branch3.displayBranch3Info();


    }
}
