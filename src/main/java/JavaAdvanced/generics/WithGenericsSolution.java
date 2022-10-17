package JavaAdvanced.generics;
import java.util.ArrayList;

//------------------------------------------
class Animal{
    public void eat(){
        System.out.println("Munch, Munch Munch");
    }
}
class Monkey extends Animal{
    private final String name;
    public Monkey(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
class Cat extends Animal{
    private final String name;
    public Cat(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
//-------------------------------------------
class GenericPrintableThings<T extends Animal, V extends Number, C, D, E>{  // Can accept mutiple Genetic Types
    private final T animalToPrint;
    private final V numberToPrint;
    private final C randomDataVariableC;
    private final D randomDataVariableD;
    public GenericPrintableThings(T animalToPrint, V numberToPrint, C randomDataVariableC, D randomDataVariableD) {
        this.animalToPrint = animalToPrint;
        this.numberToPrint = numberToPrint;
        this.randomDataVariableC = randomDataVariableC;
        this.randomDataVariableD = randomDataVariableD;
    }

    public void printAllTheTypes(){
        animalToPrint.eat();
        System.out.println(animalToPrint);
        System.out.println(numberToPrint);
        System.out.println(randomDataVariableC);
        System.out.println(randomDataVariableD);
    }

    //Return Type T object
    public T getAnimalToPrint(T animalToPrint){
        return animalToPrint;
    }

    //Return Type V object
    public V getNumberToPrint(V numberToPrint){
        return numberToPrint;
    }

    //Accept both Type T and V objects
    public <T, V> void printBoth(T animal, V number){
        System.out.println( animal + " " +  number);
    }

//    -----------------YOU ALWAYS NEED Wildcard ? WITH LISTS-------------------------------

    //Method to accept list of any Type as Param and return First element -> Wildcard ?
    public static Object printAnyListAndReturnFirstElement(ArrayList<?> myList, String msg){
        System.out.println(msg);
        System.out.println("");
        myList.forEach(System.out::println);
        return myList.get(0);
    }

    //Method to accept list of any Type as param and return the whole list -> Wildcard ?
    public static ArrayList<?> printAnyListAndReturn(ArrayList<?> myList, String msg){
        System.out.println(msg);
        System.out.println("");
        myList.forEach(System.out::println);
        return myList;
    }

    //Method to accept only Monkey class Type List as param -> Wildcard ?
    public static void printMonkeysOnly(ArrayList<? extends Monkey> myList, String msg){
        System.out.println(msg);
        System.out.println("");
        myList.forEach(System.out::println);
    }

    //Method to accept All Animal class Type Lists as param -> Wildcard ?
    public static void printAnimalsOnly(ArrayList<? extends Animal> myList, String msg){
        System.out.println(msg);
        System.out.println("");
        myList.forEach(System.out::println);
    }

    //Method to accept All Number class Type Lists only as param -> Wildcard ?
    public static void printNumberOnly(ArrayList<? extends Number> myList, String msg){
        System.out.println(msg);
        System.out.println("");
        myList.forEach(System.out::println);
    }
}

public class WithGenericsSolution {
    public static void main(String[] args) {
        GenericPrintableThings<Cat, Integer, String, Number, Boolean> catAndInt = new GenericPrintableThings<>(new Cat("Cat1"), 10, "STR", 5);
        GenericPrintableThings<Monkey, Double, String, Number, Boolean> monkeyAndDouble = new GenericPrintableThings<>(new Monkey("Monkey1"), 5.5, "STR", 5);
        GenericPrintableThings<Animal, Number, String, Number, Boolean> catAnimalAndFloat = new GenericPrintableThings<>(new Cat("Cat2"), 6.5F, "STR", 5);
        GenericPrintableThings<Animal, Number, String, Number, Boolean> monkeyAnimalAndInteger = new GenericPrintableThings<>(new Monkey("Monkey2"), 17, "STR", 5);

//        catAndInt.printTheTypes();
//        monkeyAndDouble.printTheTypes();
//        System.out.println("__________________________");
//        catAnimalAndFloat.printTheTypes();
//        monkeyAnimalAndInteger.printTheTypes();

//----------Working With Lists------------

        var cat3 = new Cat("Cat3");
        var cat4 = new Cat("Cat4");

        var monkey3 = new Monkey("Monkey3");
        var monkey4 = new Monkey("Monkey4");

        ArrayList<Cat> catList = new ArrayList<>();             // Cat List
        catList.add(cat3);
        catList.add(cat4);

        ArrayList<Monkey> monkeyList1 = new ArrayList<>();      // Monkey List 1
        monkeyList1.add(monkey3);
        monkeyList1.add(monkey4);

        ArrayList<Monkey> monkeyList2 = new ArrayList<>();      // Monkey List 2
        monkeyList2.add(monkey3);
        monkeyList2.add(monkey4);

        ArrayList<Animal> animalsList = new ArrayList<>();      // Animals List
        animalsList.add(cat3);
        animalsList.add(cat4);
        animalsList.add(monkey3);
        animalsList.add(monkey4);

        ArrayList<Number> numberList = new ArrayList<>();       // Number List
        numberList.add(10);
        numberList.add(5.5);
        numberList.add(5.5F);

        ArrayList<Integer> intList = new ArrayList<>();         // Integer List
        intList.add(7);
        intList.add(13);
        intList.add(17);

        ArrayList<Double> doubleList = new ArrayList<>();       // Doubles List
        doubleList.add(3.3);
        doubleList.add(4.3);
        doubleList.add(5.3);

        GenericPrintableThings.printAnyListAndReturnFirstElement(catList, "This is Cat List");
        System.out.println("__________________________");
        GenericPrintableThings.printMonkeysOnly(monkeyList1, "This is Monkey List 1");
        System.out.println("__________________________");
        GenericPrintableThings.printAnimalsOnly(monkeyList2, "This is Monkey List 2");
        System.out.println("__________________________");
        GenericPrintableThings.printAnimalsOnly(animalsList, "This is Animal List");
        System.out.println("__________________________");
        GenericPrintableThings.printAnyListAndReturnFirstElement(intList, "This is Integer List");
        System.out.println("__________________________");
        GenericPrintableThings.printNumberOnly(doubleList, "This is Doubles List");
        System.out.println("__________________________");
        GenericPrintableThings.printNumberOnly(numberList, "This is Numbers List");
    }
}
