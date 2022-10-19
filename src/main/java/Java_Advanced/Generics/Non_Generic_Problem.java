package Java_Advanced.Generics;

class Dog{}

class Printable_Things {
    private int intToPrint;
    private String stringToPrint;
    private Dog dogToPrint;

    public Printable_Things(int intToPrint) {
        this.intToPrint = intToPrint;
    }

    public Printable_Things(String str) {
        this.stringToPrint = str;
    }

    public Printable_Things(Dog dog) {
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

public class Non_Generic_Problem {
    public static void main(String[] args) {

        Printable_Things str = new Printable_Things("I am String");
        Printable_Things integer = new Printable_Things(10);
        Printable_Things dog = new Printable_Things(new Dog());

        str.printString();
        integer.printInt();
        dog.printDog();



    }
}
