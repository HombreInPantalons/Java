package data_structures;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {

    public static void main(String[] args) {
        //setDemo();
        listDemo();
    }


    public static void setDemo(){
        //No duplicates, not ordered list of objects, objects need to be same type.
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        //Doesnt add the duplicates; fruits.add("apple");

        System.out.println(fruits);

        fruits.remove("lemon");
        System.out.println("contains lemon? " + fruits.contains("lemon"));
        System.out.println("size: " + fruits.size());

                        //Set.of is IMMUTABLE! Toevoegen, wijzigen gaat niet!
        Set moreFruit = Set.of("pear", "raisin", "cherry");
        System.out.println(moreFruit);


    }


    public static void listDemo(){
        //list laat duplicaties toe
        //list is altijd ordered
        List fruits = new ArrayList();

        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");


        //.set = give index of the item you want to remove, and then give the name for the new object to take place.
        fruits.set(2, "grape");
        fruits.add("lemon");
        fruits.remove("lemon"); //removes first lemon found in list
        fruits.remove(3);

        System.out.println(fruits);
    }

}
