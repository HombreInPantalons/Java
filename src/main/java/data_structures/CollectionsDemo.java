package data_structures;
import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        setDemo();
//        listDemo();
//        queueDemo();
//        mapDemo();
    }


    public static void setDemo(){
//        No duplicates, not ordered list of objects, objects need to be same type.
        Set <String> fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
//        Doesnt add the duplicates; fruits.add("apple");

//        LOOPING SETS
//        Eerst de teller aanmaken:
//        var i = fruits.iterator();
//
//        while is goed om te gebruiken, 'while er elementen zijn om te loopen (hasNext?), blijf loopen'.
//        bij onze print statement vraagt men telkens het volgende object op van de collectie.
//        while(i.hasNext()){
//            System.out.print(i.next() + " | ");
//        }

//        for loop kan ook. Voor elk type Object 'fruit' in de set list y
//        for(String fruit : fruits){
//            System.out.print(fruit + " | ");
//        }

        //ForEach + Method Reference.
        //fruits.forEach(System.out::println);

        //ForEach + Lambda
        fruits.forEach(f -> {
            f = "fruit : " + f;
            System.out.println(f);
        });


//        System.out.println(fruits);
//
//        fruits.remove("lemon");
//        System.out.println("contains lemon? " + fruits.contains("lemon"));
//        System.out.println("size: " + fruits.size());
//
//                        //Set.of is IMMUTABLE! Toevoegen, wijzigen gaat niet!
//        Set moreFruit = Set.of("pear", "raisin", "cherry");
//        System.out.println(moreFruit);


    }


    public static void listDemo(){
        //list laat duplicaties toe
        //list is altijd ordered
        // tussenin <> geven we het type.
        List<String> fruits = new ArrayList();

        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");


//        //Looping, enhanced for loop
//
//        for(String fruit : fruits) {
//            System.out.print(fruit + " | ");
//        }

        //Looping, forEach() + lambda expression(conventie zegt eerste letter van uw var gebruiken ipv een woord + -> + behavior
        //Met {} kan men meerdere expressies toevoegen

//        fruits.forEach(f-> {
//            f = "fruit: " + f;
//            System.out.println(f);
//        });

        //Men kan ook een Method Reference gebruiken maar ENKEL als we 1 method toepassen.
        //Zie goed de dubbele ::
        fruits.forEach(System.out::println);


        //.set = give index of the item you want to remove, and then give the name for the new object to take place.
        fruits.set(2, "grape");
        fruits.add("lemon");
        //fruits.remove("lemon"); //removes first lemon found in list
        fruits.remove(3);

//        System.out.println(fruits);
//        System.out.println("Fruit at index 2: " + fruits.get(2));
//        System.out.println("Index of grape: " + fruits.indexOf("grape"));
//        System.out.println("Last index of lemon: " + fruits.lastIndexOf("lemon"));
//        System.out.println("First index of lemon: " + fruits.indexOf("lemon"));

        //Immutable list
        List moreFruit = List.of("cherry", "plum");



    }


    public static void queueDemo(){

        //queue = LinkedList
        //queue holds ordered elements that are processed in order which they are added. (FIFO)
        //Duplicates allowed

        Queue fruits = new LinkedList();

        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

        //.remove(); heeft bij een queue geen argument nodig. Zoals bij het FIFO systeem zal het het eerste element verwijderen dat het tegenkomt.
        //De head van the line, laatste element is the tail.
        //In een queue is het de bedoeling dat data dat wordt verwijderd processed wordt. Daarom gaat .remove(); hier het object returnen.
        //In de meeste gevallen zal .remove(); 'void' returnen, maar bij een queue (linkedlist) nooit.
        //Hieronder wordt apple verwijderd, en opgeslagen in de var removed.

        var removed = fruits.remove();

        //.peek(); laat u zien wat het volgende object is in de queue, en returned het object zonder het te verwijderen van de queue.
        System.out.println("head of queue: " + fruits.peek());

        System.out.println(removed);
        System.out.println(fruits);


    }


    public static void mapDemo(){
        //map is part of the collection framework BUT does not inherit from the interface.
        //map does not inherit from the collections interface (data structures) zoals set list & queue. Die wel.
        //Daarom heeft Map niet dezelfde methods als de rest.
        //unordered unique key-value pairs.

        Map <String, Integer> fruitCalories = new HashMap();

        //.put om waarden toe te voegen. De 95 calorieën hier, zijn geen int maar wel Integer. (Object).
        //Met .put ga je elementen overschrijven als je duplicates invoegt.
        //Met .putIfAbsent ga je eerst checken of het element al aanwezig is.

        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);

        fruitCalories.remove("lemon");
        fruitCalories.putIfAbsent("lemon", 17);
        fruitCalories.putIfAbsent("lemon", 25);

        //Looping in Maps

        //EntrySet()
        //Gebruik maken van entrySet(), er is geen iterator hier.
        //We maken eerst een Set van de Map, en dan kunnen we de iterator gebruiken.

//        Set mapEntries = fruitCalories.entrySet();
//        var i = mapEntries.iterator();
//        while (i.hasNext()){
//            //Here casten we  naar Map.Entry om key en value in eenzelfde "container" of class te krijgen om over te loopen.
//            //Wordt niet vaak gebruikt, er zijn makkelijkere manieren om door een Map te loopen.
//            //Hier maken we een Set van de Map, en casten vanuit de Set terug naar de Map met de Set iterator vanuit Java collections..
//            Map.Entry entry = (Map.Entry)i.next();
//            System.out.print(entry.getKey() + " has ");
//            System.out.println(entry.getValue() + " calories ");
//        }

        //Enhanced for loop
//        for(Map.Entry calorieInfo : fruitCalories.entrySet()){
//            System.out.print(calorieInfo.getKey() + " : " + calorieInfo.getValue() + " | ");
//        }

        //ForEach() loop, in de lambda expressie gebruiken we k voor key en v voor value.
        //This is the best way :)
        fruitCalories.forEach((k, v) -> {
            k = "the fruit named " + k;
            System.out.println(k + " has " + v + " calories");
        });


        //If you search the key you get the value.
        System.out.println("banana calories: " + fruitCalories.get("banana"));

        //Does it contain a specific key?
        System.out.println("Contains orange? " + fruitCalories.containsKey("orange"));

        System.out.println(fruitCalories);

        //Immutable map
        Map immutableFruitCalories = Map.of(

                "apple", 95,
                "lemon", 20,
                "banana", 105,
                "orange", 45
        );
    }

}
