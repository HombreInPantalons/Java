package abstraction;

public class ShapeTester {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(15,20);
        double omtrek = rectangle.calculateArea();
        System.out.println(omtrek);
        rectangle.print();

    }



}
