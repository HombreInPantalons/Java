package abstraction;
//Alle abstracte methodes MOETEN geïmplementeerd worden van de superclass, anders ERROR.
//OF je maakt jezelf een abstract class.

public class Rectangle extends Shape{
    //FIELD
    protected double length;
    protected double width;

    //CONSTRUCTORS
    //ALL ARGS
    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }


    //BEHAVIOR
    //Methods
    @Override
    double calculateArea() {
        return length * width;
    }
    //Getters and Setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
