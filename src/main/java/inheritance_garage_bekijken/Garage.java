package inheritance_garage_bekijken;

public class Garage {

    public static void main(String[] args) {

        Coupe myCar = new Coupe();
        myCar.setColor("red"); //.setColor komt van de Class Vehicle.Java (overgrootvader van Garage.java)

        //Ookal zijn er meerdere classes die inheriten van dezelfde SUPER class, wilt dit niet zeggen dat ze siblings worden.
        //Deze hebben geen relatie met elkaar!
        //Alles dat niet private is wordt inherited, behalve constructors. Enkel FIELD en BEHAVIOR.
        //FINAL METHODS worden wel inherited maar kunnen niet worden overridden.

        //PUBLIC = vanuit elke package kan je inheriten.
        //PROTECTED = enkel vanuit dezelfde package of als subclass kan je inheriten.
        //Als men een Public method inheriten, kan men deze niet aanpassen naar Protected of Private.
        //Dus bij het overriden van een method is het enkel mogelijk om de strictheid te verminderen niet vermeerderen.

        //SEALED CLASSES:
        //classes that restrict access to specific classes.
    }

}
