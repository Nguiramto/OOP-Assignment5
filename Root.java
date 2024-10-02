

public abstract class Root {
    protected String FirstName;
    protected String LastName;
    protected int Age;
    protected String Gender;
    protected int Phone;

    public Root(String FirstName, String LastName, int Age, String Gender, int Phone) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
        this.Gender = Gender;
        this.Phone = Phone;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return Age;
    }

    public String getGender() {
        return Gender;
    }

    public int getPhone() {
        return Phone;
    }

    public void dispalyInfo() {
        System.out.println("First Name: " + FirstName);
        System.out.println("Last Name: " + LastName);
        System.out.println("Age: " + Age);
        System.out.println("Gender: " + Gender);
        System.out.println("Phone: " + Phone);
    }
}

