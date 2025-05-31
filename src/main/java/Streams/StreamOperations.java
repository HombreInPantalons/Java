package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {

        static List<String> veggies = List.of(
         "spinach",
         "cabbage",
         "peas",
         "green beans",
         "brussel sprouts",
         "carrots");

    public static void main(String[] args) {
        //anyMatchDemo();
        //allMatchDemo();
        //filterDemo();
        //mapDemo();
        //reduceDemo();
        //intReduceDemo();
        //collectDemo();
        //multiOperationDemo();
    }
    public static void anyMatchDemo(){

        //Anymatch (Terminal Operation, 1 method max)
        //Takes a predicate(functional interface) <-- zie functional interfaces
        //returns boolean
        //Hier zoeken we bv of er tussen onze objecten minstens 1 spatie zit
        boolean anyMatches = veggies.stream().anyMatch(v -> v.contains(" "));
        System.out.println(anyMatches);
    }

    public static void allMatchDemo(){
        //Bezit elke groente een "s"?
        //Terminal Operation
        boolean allMatch = veggies.stream()
                .allMatch(v -> v.contains("s"));
        System.out.println(allMatch);
    }

    public static void filterDemo(){
        //Intermediate Operator, meerdere methodes mogelijk!
        //Zoeken naar veggies die starten met "c" en eruit filteren met de method reference
        veggies.stream()
                .filter(v -> v.startsWith("c"))
                .forEach(System.out::println);
    }

    public static void mapDemo(){
        //Intermediate Operation
        //We gaan hier alle strings uppercase maken, met een method reference.
        veggies.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    public static void reduceDemo(){
        //reduce smushed alles samen naar wat je wilt.
        //We geven reduce() eerst een identity (een plaats om te starten), als we een string reducen geven we deze (""); start met niets dus.
        //BinaryOperator (2 argumenten van hetzelfde type) a,b hier.
        //Dan de operation, hier voegen we de volledige stream samen in 1 String met | delimited. Sorted.
        //Men kan Intermediate operations linken zoals sort enzovoort VOOR dat men een terminal operator gebruikt zoals reduce.
        //Terminal operators eindigen uw stream in zijn geheel dus kan je ERNA geen operations meer toevoegen.
        System.out.println(
                veggies.stream()
                        .sorted()
                        .reduce("",(a,b) -> a + " | " + b));
    }

    public static void intReduceDemo(){
        //Hetzelfde als reduceDemo bij strings.
        //Hier gaan we alles opsommen in de List.
        List<Integer> numbers = List.of(2,4,6,8,10);
        var sum = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println(sum);
    }

    public static void collectDemo(){
        //gaat meestal gebruikt worden op finale data en dan de stream assignen naar een collection of choice.
        //we zullen hier iets filteren en dan collecten.
        //Terminal Operator

        List veggiesEndingWithS = veggies.stream()
                .filter(v -> v.endsWith("s"))
                .collect(Collectors.toList());
        veggiesEndingWithS.forEach(System.out::println);

    }

    public static void multiOperationDemo(){
        //Meerdere samenvoegen om de echte power te zien :)
        List crazyList = veggies.stream()
                //sorteren
                .sorted()
                //filteren starten met c
                .filter(v -> v.startsWith("c"))
                //alles naar uppercase
                .map(String::toUpperCase)
                //we voegen er een woord aan toe, lambda in lambda
                .map(v-> v.transform(w -> "yummy " + w))
                //We collecten alles in een nieuwe list
                .collect(Collectors.toList());
            crazyList.forEach(System.out::println);
    }
}
