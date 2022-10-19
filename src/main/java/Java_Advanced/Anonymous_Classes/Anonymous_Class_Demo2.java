package Java_Advanced.Anonymous_Classes;
class Water{}
abstract class Beer{}
interface Whiskey{}
public class Anonymous_Class_Demo2 {
    public static void main(String[] args) {
        Water water = new Water()
        {
            //Anonymous class extending Water Class
        };
        Beer beer = new Beer() {
            //Anonymous class extending Abstract Class
        };
        Whiskey whiskey = new Whiskey() {
            //Anonymous class implementing interface
        };
    }
}
