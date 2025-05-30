package inheritance;

public class Employee extends Person{


    //field
    private String employeeID;
    private String title;

    //constructors
    public Employee(){
        super("Anthony"); //will call the constructor that matches the parameter list. 1 van de 2 constructors uit Person zal gebruikt worden.
        System.out.println("In employee default constructor");
    }



    //methods
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
