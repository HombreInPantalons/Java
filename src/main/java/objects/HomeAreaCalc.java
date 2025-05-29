package objects;

import org.w3c.dom.css.Rect;

public class HomeAreaCalc {


    public static void main(String[] args) {

        //Objects kunnen gebruikt worden als Type zoals int, String, ..
        //Hier gebruiken we de default constructor vanin Rectangle.java

        Rectangle kamer1 = new Rectangle();
        kamer1.setLengte(50);
        kamer1.setBreedte(25);
        kamer1.setHoogte(10);
        double oppervlakteKamer1 = kamer1.calcOppervlakte();

        //Hier gebruiken we de all args constructor vanin Rectangle.java
        Rectangle kamer2 = new Rectangle(100,50,15);
        double oppervlakteKamer2 = kamer2.calcOppervlakte();


        double oppervlakte = oppervlakteKamer1 + oppervlakteKamer2;
        System.out.println(oppervlakte);
    }

}
