package inheritance_2;

public class Garage {

    public static void main(String[] args) {

        Coupe myCar = new Coupe();
        myCar.setColor("red"); //.setColor komt van de Class Vehicle.Java (overgrootvader van Garage.java)

        //Ookal zijn er meerdere classes die inheriten van dezelfde SUPER class, wilt dit niet zeggen dat ze siblings worden.
        //Deze hebben geen relatie met elkaar!

    }

}
