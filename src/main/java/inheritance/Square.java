package inheritance;


//Create square class that inherits from Rectangle, and override its calcOmtrek() method

import objects.Rectangle;

public class Square extends Rectangle {

    //We erven de method van Rectangle, maar gaan de inhoud overschrijven.
    //Men kan hier zijden & lengte gebruiken omdat ze op Protected staan en niet Private.
    //Moesten ze op private staan zouden we de getters getZijden() & getLengte() moeten gebruiken die wel zijn geërfd.
    @Override
    public double calcOmtrek(){
         return zijden * lengte;
    }

}
