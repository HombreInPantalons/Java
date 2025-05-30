package objects;

public class Rectangle {

//Encapsulation is de Field (data) en de Behavior (methods) private of public (so far) toekennen.
//Constructors komen tussen Field en Behavior


    //FIELD van de rectangle, (de data) houden we best private als we dit voor ons eigen class willen houden.
    //Protected gebruiken we als we andere classes willen laten inheriten van deze FIELD.

    protected double lengte;
    protected double breedte;
    protected double hoogte;
    protected int zijden = 6;


    //Constructors van de rectangle

    //Default constructor neemt geen args (is niet nodig maar kan wel gebruikt worden, Java gebruikt altijd een default constructor zonder waarden):

     public Rectangle(){
        setLengte(0);
        setBreedte(0);
        setHoogte(0);
    }

    //All Args constructor

    public Rectangle(double lengte, double breedte, double hoogte){

        setLengte(lengte);
        setBreedte(breedte);
        setHoogte(hoogte);

    }

    //BEHAVIOR van de rectangle, (de methods) houden we best public.

    public double calcOmtrek(){
        return(2 * lengte) + (2 * breedte);
    }

    public double calcOppervlakte(){
        return(lengte * breedte);
    }

    public double calcInhoud(){
        return(lengte * breedte * hoogte);
    }

    //Getters & Setters, methodes dat de Field setten en methodes dat de Field getten. Rechtsclick -> Generate -> Getter & Setter.


    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double getBreedte() {
        return breedte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public double getHoogte() {
        return hoogte;
    }

    public void setHoogte(double hoogte) {
        this.hoogte = hoogte;
    }

    public int getZijden() {
        return zijden;
    }

    public void setZijden(int zijden) {
        this.zijden = zijden;
    }
}


