package abstraction;

public abstract class Shape {
    //Heeft geen FIELD, wordt gebruikt om geïmplementeerd te worden.
    //De methodes die gebruikt worden moeten ook Abstract gedeclareerd worden.

    abstract double calculateArea();

    public void print(){
        System.out.println("I am a shape");
    }







}
