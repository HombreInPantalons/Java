package functional_interface;

public class Functional_Interfaces {

    //Een functional interface, is een interface met 1 abstracte methode, waaruit lambda/method references implementeren.
    //1 van deze functional interfaces is ook de Consumer interface genoemd. (java.util.function.Consumer)
    //Deze method dat wordt opgevraagd is: void accept(T t);
    //Dus we kunnen deze op bepaalde manieren gaan opvragen.
    //Tot nu toe gebruikt

    // 1) We gebruiken de normale lambda methode met een foreach.
    //    collection.forEach(t -> system.out.println(t));

    // 2) We gebruiken de Consumer interface om een variabel te maken.
    //    List countries = List.of("x", "y", "z");
    //    Consumer print = t -> System.out.println(t));
    //    countries.forEach(print)

    // 3) We gebruiken de abstract method accept met de lambda expression.
    //    Consumer print = t -> System.out.println(t));
    //    print.accept("Hello World");

    // 4) We gebruiken de abstract method accept met een method reference.
    //    Consumer print = System.out::println();
    //    print.accept("Hello World");

    //Nog functional interfaces waaruit lambda expressions ontstaan zijn:
    // Supplier, Predicate, Function, UnaryOperator, BinaryOperator

    //Supplier: Accepts no arguments | returns a result | T get()
    //Predicate: Accepts one argument | returns a boolean result | boolean test(T t)
    //Function: Accepts one argument | returns a result | R apply(T t)
    //UnaryOperator: Accepts on argument | returns result of the same type | T apply (T t)
    //BinaryOperator: Accepts two arguments of the same type | returns result of the same type | T apply(T t, T u)



}
