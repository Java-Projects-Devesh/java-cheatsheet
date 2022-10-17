package JavaAdvanced.AbstractClassAndInterface;

abstract class Building{
    String location;

    public Building() {}

    public Building(String location) {
        this.location = location;
    }
    public abstract void abstractMethod();

    public static void staticMethod() { }

    public void generalMethod() { }
}


public class AbstractClassDemo {
    public static void main(String[] args) {

    }
}
