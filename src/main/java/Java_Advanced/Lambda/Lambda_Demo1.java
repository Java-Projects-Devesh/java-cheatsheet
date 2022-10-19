package Java_Advanced.Lambda;

@FunctionalInterface
interface Animal {
    void eats();
}
class Cat implements Animal { // Class Cat implementing Animal interface to use eats functionality
    @Override
    public void eats() {      // eats() functionality of Animal interface
        System.out.println("Inside Cat class : Cat eats.");
    }
}

public class Lambda_Demo1   {
    public static void main(String[] args) {
        Animal cat1 = new Cat(); // cat1 is Cat class instance and is an Animal
        cat1.eats();          // Using eats() functionality with cat1 instance

        Animal cat2 = new Animal() { //cat2 is a anonymous class instance and is an Animal
            @Override
            public void eats() {
                System.out.println("Inside Anonymous class : Cat eats.");
            }
        };
        cat2.eats();   //Using eats() functionality with cat2 instance

        // cat3 = variable containing Lambda expression
        Animal cat3 = ()-> System.out.println("Inside Lambda : Cat Eats.");  //cat3 = variable = Lambda
        cat3.eats(); // Using eats() functionality with cat3 Lambda variable

        animalFunction(cat1);   // animalFunction accepts Animal (Cat class instance)
        animalFunction(cat2);   // animalFunction accepts Animal (Anonymous class instance)

        // Below animalFunction accepts functionality of Animal
        // (Wrapped in Lambda variable : cat3 )
        //Functional Programming
        animalFunction(cat3);

        //Below animalFunction accepts functionality of Animal directly // Accepts Lambda
        //Functional Programming
        animalFunction(()-> System.out.println("Cat eats : Functionality passed"));
    }

    // method to accept of type Animal functional interface
    // or it's functionality
    public static void animalFunction(Animal animal){
        animal.eats();
    }
}