package JavaAdvanced.AbstractClassAndInterface;

interface FourWheeler {
//    String STRING_IN_INTERFACE; // Since Constructor is not allowed inside interface, All variables must be declared.
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
    public void cleanVehicle() {
        System.out.println(FourWheeler.numberOfWheels);
        System.out.println("Car cleaned.");
    }
}
public class InterfaceDemos {
    public static void main(String[] args) {
        FourWheeler.doOilChange();   //Oil Changed. // Default method accessed with interface name.

        FourWheeler car = new Car();
        car.cleanVehicle();         // 4, Car cleaned. //Overrriden method in class Car
        car.startVehicle("Car");    // CarStarted // Default method
    }
}
