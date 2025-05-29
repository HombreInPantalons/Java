package objects;

//Record ipv Class, voor simpele objects.
//Record Fields zijn final, eens data ingegeven kan het niet meer aangepast worden met bv Setter methods nadien.
public record Records(
    int id,
    int customerId,
    String type,
    double balance)
 //curly braces worden geopend na de record 'argumenten', hierin kan men dan methodes toevoegen indien gewenst.
{
    public void addedMethod(){
        System.out.println("nothing");
    }


    public static void main(String[] args) {

        Records account = new Records(12345, 54321, "CHECKING", 2178.5);

    }


}







