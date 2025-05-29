package objects;

import java.util.Scanner;

public class HomeAreaCalcV2 {

    //Hier maken we de scanner private idpv static in onze class global.

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Moeten object maken in onze class (calculator hier gwn een naam gegeven) zodat men methode kan gebruiken van non static (getRoom)
        // naar static (main).


        HomeAreaCalcV2 calculator = new HomeAreaCalcV2();
        Rectangle kamer1 = calculator.getRoom();
        Rectangle kamer2 = calculator.getRoom();
        double oppKamer1 = kamer1.calcOppervlakte();
        double oppKamer2 = kamer2.calcOppervlakte();
        double inhoudKamer1 = kamer1.calcInhoud();
        double inhoudKamer2 = kamer2.calcInhoud();
        double totaleOpp = calculator.calculateAreaOfRoom(kamer1,kamer2);
        double totaleInhoud = calculator.calcInhoud(kamer1, kamer2);
        System.out.println("Kamer 1 heeft als oppervlakte: " + oppKamer1 + " m2 en als inhoud: " + inhoudKamer1 + " m3 .");
        System.out.println("Kamer 2 heeft als oppervlakte: " + oppKamer2 + " m2 en als inhoud: " + inhoudKamer2 + " m3 .");
        System.out.println(totaleOpp + " m2 is de totale oppervlakte van beide kamers");
        System.out.println(totaleInhoud + " m3 is de totale inhoud van beide kamers");

    }


    //Sending object
    public Rectangle getRoom(){
        System.out.println("Geef de lengte,breedte en hoogte");
        double lengte = scanner.nextDouble();
        double breedte = scanner.nextDouble();
        double hoogte = scanner.nextDouble();
        scanner.close();
        //Return van een nieuw object!
        return new Rectangle(lengte, breedte, hoogte);
    }

    //Calculate Area
    public double calculateAreaOfRoom(Rectangle kamer1, Rectangle kamer2){
        return kamer1.calcOppervlakte() + kamer2.calcOppervlakte();
    }

    public double calcInhoud(Rectangle kamer1, Rectangle kamer2){
        return kamer1.calcInhoud() + kamer2.calcInhoud();
    }

}
