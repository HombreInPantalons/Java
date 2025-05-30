package polymorphism;

public class Zoo {

    public static void main(String[] args) {


        //regular inheritance
        Dog rocky = new Dog();
        //feed(rocky); krijgt dogfood
        //rocky.fetch();
        //rocky.makeSound();


        //polymorphism hieronder implicit upcast (from dog to animal).
        //Implicit upcast, the object now only has access to the methods of the class it was upcasted to.
        //maw, makeSound(); is mogelijk omdat het van Animal komt, maar Fetch niet omdat dat expliciet bij de Dog class behoort.

        //Animal sasha = new Dog();
        //feed(sasha); krijgt dogfood
        //instanceof, deel van
        //boolean isAnimal = sasha instanceof Animal; //True
        //boolean isDog = sasha instanceof Dog; //ook True
        //sasha.makeSound();

        //sasha = new Cat();
        // feed(sasha); krijgt catfood
        //sasha.makeSound();
        //Hier kan sasha als kat nog niet aan de scratch method omdat ze van type Animal nog steeds is.
        //Dus moeten we downcasten.
        //Downcasten doet men alst volgt:
        //voor de naam (Class) waar we willen naartoe downcasten.

        //dan class + naam in () plaatsen zodat het wordt aanzien als object in Java.
        //Sasha is nog steeds Animal, maar gaat deze method uitvoeren doormiddel van de TypeCast.
        //((Cat)sasha).scratch();


        //INSTANCEOF PATTERN MATCHING
        //Creëren van een nieuw object op basis van Instanceof. sashaTheDog is hier het nieuw object.

        Animal sasha = new Dog();
        //verkorte manier
        //if(sasha instanceof Dog sashaTheDog){
        //    sashaTheDog.fetch();
        //}

        //oude manier
        //if(sasha instanceof Dog){
        //    Dog sashaTheDog = (Dog)sasha;
        //    sashaTheDog.fetch();
        //}



    }


    //Voederen op basis van welk type dier het is, als parameters geven we in een animal van Type Animal.
    //Kan ook van elke subclass van Animal zijn!

    public static void feed(Animal animal){
        if(animal instanceof Dog) {
            System.out.println("Dog food!");
        } else if(animal instanceof Cat) {
            System.out.println("Cat food!");
        }
    }

}
