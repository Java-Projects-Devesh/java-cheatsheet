package Java_Advanced.Abstract_Class_and_Interfaces;
interface FourWheeler {
 // Since Constructor is not allowed inside interface, All variables must be declared.
//    String STRING_IN_INTERFACE;
    int numberOfWheels = 4; //In Java All variables inside interface are PUBLIC, FINAL, STATIC
    void cleanVehicle();    // Must be overriden in child class
    default void startVehicle(String vehicle) {  // DEFAULT method can be overridden, not compulsory.
        System.out.println(vehicle + "Started");
    }
    static void doOilChange(){  // Static method can be accessed with Interface name.
        System.out.println("Oil Changed.");
    }
}
class Car implements FourWheeler{
    @Override
    public void cleanVehicle() { //ABSTRACT method overridden
        System.out.println(FourWheeler.numberOfWheels); // Accessing static variable with Interface name
        System.out.println("Car cleaned.");
    }
}
public class Interface_Demo2 {
    public static void main(String[] args) {
        FourWheeler.doOilChange();   //Oil Changed. // Default method accessed with interface name.

        FourWheeler car = new Car();
        car.cleanVehicle();         // 4, Car cleaned.
        car.startVehicle("Car");    // Car Started // Default method
    }
}
