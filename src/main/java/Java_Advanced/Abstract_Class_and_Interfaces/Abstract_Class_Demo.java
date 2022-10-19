package Java_Advanced.Abstract_Class_and_Interfaces;

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


public class Abstract_Class_Demo {
    public static void main(String[] args) {

    }
}
