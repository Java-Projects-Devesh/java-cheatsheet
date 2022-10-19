package Java_Advanced.Generics;
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
class Generic_Printable_Things<T extends Animal, V extends Number, C, D, E>{  // Can accept mutiple Genetic Types
    private final T ANIMAL_TO_PRINT;
    private final V NUMBER_TO_PRINT;
    private final C VARIABLE_C;
    private final D VARIABLE_D;
    public Generic_Printable_Things(T animalToPrint, V numberToPrint, C randomDataVariableC, D randomDataVariableD) {
        this.ANIMAL_TO_PRINT = animalToPrint;
        this.NUMBER_TO_PRINT = numberToPrint;
        this.VARIABLE_C = randomDataVariableC;
        this.VARIABLE_D = randomDataVariableD;
    }

    public void print_All_Types(){
        ANIMAL_TO_PRINT.eat();
        System.out.println(ANIMAL_TO_PRINT);
        System.out.println(NUMBER_TO_PRINT);
        System.out.println(VARIABLE_C);
        System.out.println(VARIABLE_D);
    }

    //Return Type T object
    public T get_Animal_To_Print(T animalToPrint){
        return animalToPrint;
    }

    //Return Type V object
    public V get_Number_To_Print(V numberToPrint){
        return numberToPrint;
    }

    //Accept both Type T and V objects
    public <T, V> void print_Both_Types(T animal, V number){
        System.out.println( animal + " " +  number);
    }

//    -----------------YOU ALWAYS NEED Wildcard ? WITH LISTS-------------------------------

    //Method to accept list of any Type as Param and return First element -> Wildcard ?
    public static Object print_Any_Type_List_And_Return_First_Element(ArrayList<?> myList, String msg){
        System.out.println(msg);
        System.out.println("");
        myList.forEach(System.out::println);
        return myList.get(0);
    }

    //Method to accept list of any Type as param and return the whole list -> Wildcard ?
    public static ArrayList<?> print_Any_Type_List_And_Return(ArrayList<?> myList, String msg){
        System.out.println(msg);
        System.out.println("");
        myList.forEach(System.out::println);
        return myList;
    }

    //Method to accept only Monkey class Type List as param -> Wildcard ?
    public static void print_Monkeys_Only(ArrayList<? extends Monkey> myList, String msg){
        System.out.println(msg);
        System.out.println("");
        myList.forEach(System.out::println);
    }

    //Method to accept All Animal class Type Lists as param -> Wildcard ?
    public static void print_Animals_Only(ArrayList<? extends Animal> myList, String msg){
        System.out.println(msg);
        System.out.println("");
        myList.forEach(System.out::println);
    }

    //Method to accept All Number class Type Lists only as param -> Wildcard ?
    public static void print_Number_Only(ArrayList<? extends Number> myList, String msg){
        System.out.println(msg);
        System.out.println("");
        myList.forEach(System.out::println);
    }
}

public class Generics_Solution {
    public static void main(String[] args) {
        Generic_Printable_Things<Cat, Integer, String, Number, Boolean> catAndInt = new Generic_Printable_Things<>(new Cat("Cat1"), 10, "STR", 5);
        Generic_Printable_Things<Monkey, Double, String, Number, Boolean> monkeyAndDouble = new Generic_Printable_Things<>(new Monkey("Monkey1"), 5.5, "STR", 5);
        Generic_Printable_Things<Animal, Number, String, Number, Boolean> catAnimalAndFloat = new Generic_Printable_Things<>(new Cat("Cat2"), 6.5F, "STR", 5);
        Generic_Printable_Things<Animal, Number, String, Number, Boolean> monkeyAnimalAndInteger = new Generic_Printable_Things<>(new Monkey("Monkey2"), 17, "STR", 5);

        catAndInt.print_All_Types();
        monkeyAndDouble.print_All_Types();
        System.out.println("__________________________");
        catAnimalAndFloat.print_All_Types();
        monkeyAnimalAndInteger.print_All_Types();

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

        Generic_Printable_Things.print_Any_Type_List_And_Return_First_Element(catList, "This is Cat List");
        System.out.println("__________________________");
        Generic_Printable_Things.print_Monkeys_Only(monkeyList1, "This is Monkey List 1");
        System.out.println("__________________________");
        Generic_Printable_Things.print_Animals_Only(monkeyList2, "This is Monkey List 2");
        System.out.println("__________________________");
        Generic_Printable_Things.print_Animals_Only(animalsList, "This is Animal List");
        System.out.println("__________________________");
        Generic_Printable_Things.print_Any_Type_List_And_Return_First_Element(intList, "This is Integer List");
        System.out.println("__________________________");
        Generic_Printable_Things.print_Number_Only(doubleList, "This is Doubles List");
        System.out.println("__________________________");
        Generic_Printable_Things.print_Number_Only(numberList, "This is Numbers List");
    }
}
