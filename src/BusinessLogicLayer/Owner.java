package BusinessLogicLayer;

public class Owner {
    //Atributes
    private String ownerID;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private int age;
    private int cellNumber;
    private String email;
    private String nationalID;
    
    //Properties
    public String getOwnerID() {
        return ownerID;
    }
    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getCellNumber() {
        return cellNumber;
    }
    public void setCellNumber(int cellNumber) {
        this.cellNumber = cellNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNationalID() {
        return nationalID;
    }
    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    //Parameterized Constructor
    public Owner(String ownerID, String username, String password, String firstName, String lastName, int age,
            int cellNumber, String email, String nationalID) {
        this.ownerID = ownerID;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.cellNumber = cellNumber;
        this.email = email;
        this.nationalID = nationalID;
    }
    
    
}
