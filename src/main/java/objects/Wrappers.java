package objects;

public class Wrappers {


    public static void main(String[] args) {

        //Als men zoals hier bv Integer gebruikt gaan we int wrappen in een object waarmee men dan object gerelateerde
        //methodes kan selecteren zoals nummer2.method!

        int nummer1 = 5;
        Integer nummer2 = 5;

        //String is een object, geen wrapper class van een 'string'.
        String string = "Stringy strings";
    }
}
