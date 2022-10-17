package JavaAdvanced.generics;

class Dog{}

class PrintableThings{
    private int intToPrint;
    private String stringToPrint;
    private Dog dogToPrint;

    public PrintableThings(int intToPrint) {
        this.intToPrint = intToPrint;
    }

    public PrintableThings(String str) {
        this.stringToPrint = str;
    }

    public PrintableThings(Dog dog) {
        this.dogToPrint = dog;
    }


    public void printInt(){
        System.out.println(intToPrint);
    }

    public void printString(){
        System.out.println(stringToPrint);
    }

    public void printDog(){
        System.out.println(dogToPrint);
    }

}

public class NonGenericProblem {
    public static void main(String[] args) {

        PrintableThings str = new PrintableThings("I am String");
        PrintableThings integer = new PrintableThings(10);
        PrintableThings dog = new PrintableThings(new Dog());

        str.printString();
        integer.printInt();
        dog.printDog();



    }
}
