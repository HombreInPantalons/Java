package inheritance;


//Create square class that inherits from Rectangle, and override its calcOmtrek() method
//OVERRIDING METHODS = Signature blijft hetzelfde (De naam + het type zoals String, int, ...) enkel de body van de method wisselt.
//OVERLOADING METHODS = Signature verandert (Naam blijft hetzelfde, maar body verandert en mss type ook verplicht? Nog uitzoeken).

import objects.Rectangle;

public class Square extends Rectangle {

    //We erven de method van Rectangle, maar gaan de inhoud overschrijven.
    //Men kan hier zijden & lengte gebruiken omdat ze op Protected staan en niet Private.
    //Moesten ze op private staan zouden we de getters getZijden() & getLengte() moeten gebruiken die wel zijn geërfd.
    @Override
    public double calcOmtrek(){
         return zijden * lengte;
    }


    //We geven hier als parameter een String aan terwijl er in de Super class (Rectangle) in deze method geen parameters terug te vinden zijn.
    //Op deze manier OVERLOADEN we een method.
    public void print(String what){
        System.out.println("I am a " + what);
    }

}
