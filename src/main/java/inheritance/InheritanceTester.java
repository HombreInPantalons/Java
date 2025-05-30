package inheritance;

import objects.Rectangle;

public class InheritanceTester {


    public static void main(String[] args) {

        //Person person = new Person(); //Name, Age, Gender mogelijk in dit object.
        //Employee employee = new Employee(); //Name, Age, Gender, Title, EmployeeID mogelijk in dit object
        Square square = new Square();
        //square.setLengte(25);
        //System.out.println( square.calcOmtrek());

        Rectangle rectangle = new Rectangle();
        //rectangle.print(); //Hier hebben we enkel de print() zonder arguments omdat de method van de Superclass komt
        //square.print("square"); //hier hebben we de keuze uit print() en print(what) omdat we de overload method hebben gebruikt
    }


}
