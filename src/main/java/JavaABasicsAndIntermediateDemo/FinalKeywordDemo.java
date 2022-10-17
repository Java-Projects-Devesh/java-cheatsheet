package JavaABasicsAndIntermediateDemo;

final class ABC{} // FINAL class Can't be inherited

public class FinalKeywordDemo {
    final int numberOfRoads = 10; // FINAL makes a variable CONST
    final String city;

    public FinalKeywordDemo(String city) {
        this.city = city;      //Can be assigned only once
    }

    public final void someMethod(){ //FINAL method Can't be overridden in child class
        //This method can't be overridden
    }
}


