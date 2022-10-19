package Java_Advanced.Lambda;

interface Vehicle { //Function Interface with only 1 Abstract Method
    void drive();
}

public class Lambda_Demo2 {
    public static void main(String[] args) {
        Vehicle bus = new Vehicle() { // Regular Anonymous class implementing a FUNCTIONAL INTERFACE
            @Override
            public void drive() {
                System.out.println("Bus Drives");
            }
        };

        // Simplified implementation of single abstract method of a FUNCTIONAL INTERFACE
        Vehicle car = ()-> System.out.println("Car Drives"); //Lambda Expression

        bus.drive(); // Bus Drives
        car.drive(); // Car Drives
    }
}
