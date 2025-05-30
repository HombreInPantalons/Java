package inheritance;
//Inheritance, gelijkstaande classes(subclasses) verkrijgen de specificaties. Person & Employee zijn namelijk allebei een persoon maar
//Employee is een speciaal type Persoon als class.
//Enkel niet private zaken kunnen geërfd worden.


public class Person {

    //field
    private String name;
    private int age;
    private String gender;


    //constructors
    public Person(){
        System.out.println("In Person default constructor");
    }

    public Person(String name){
        System.out.println("In person second constructor");
    }




    //methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
