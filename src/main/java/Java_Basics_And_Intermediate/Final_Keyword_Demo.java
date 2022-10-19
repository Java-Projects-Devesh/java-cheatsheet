package Java_Basics_And_Intermediate;

final class ABC{} // FINAL class Can't be inherited

public class Final_Keyword_Demo {
    final int number_Of_Roads = 10; // FINAL makes a variable CONST
    final String city;

    public Final_Keyword_Demo(String city) {
        this.city = city;      //Can be assigned only once
    }

    public final void someMethod(){ //FINAL method Can't be overridden in child class
        //This method can't be overridden
    }
}


