package JavaAdvanced.lambdaAndMethodReference;

class Water{}
abstract class Beer{}
interface Whiskey{}

public class AnonymousInnerClassDemo {
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
