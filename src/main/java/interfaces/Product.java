package interfaces;

public interface Product {

    String getName();
    void setName(String name);

    //Als men default hier voor plaatst en een body aanmaakt {} zijn subclasses niet verplicht deze te implementeren.
    //Interfaces hebben automatisch het type abstract voor methodes, daarom moeten we deze aanpassen naar default bij
    //geen noodzakelijke methodes. Anders ERROR bij alle subclasses en heel programma crashed.

    default double getPrice(){
        return 50;
    }
    default void setPrice(double price){

    }
}
