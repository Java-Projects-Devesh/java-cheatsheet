package JavaABasicsAndIntermediateDemo;

public class BoxingUnboxing {
    public static void main(String[] args) {

        int i = 5; //Primitive variable

        Integer m = new Integer(5); //Boxing - Deprecated and not required, Use Autoboxing
        Integer ii = new Integer(i); // Boxing - Deprecated and not required, Use Autoboxing

        Integer iii = i;   // Autoboxing - Automatically boxing the value of i in an Integer Object
        Integer iiii = 10; // Autoboxing - Automatically boxing the value of 10 in an Integer Object

        int j = ii.intValue(); //Unboxing - Not required, use Auto-Unboxing

        int jj = ii;     //Auto-unboxing
        int jjj = iiii;  //Auto-unboxing
    }
}
