package Java_Basics_And_Intermediate;


class Vehiclee {
    public void run() {
        System.out.println("Vehicle running");
    }
}
class Caar extends Vehiclee {
    @Override
    public void run() {
        System.out.println("Car running");
    }
    public void config() {}
}
class Bus extends Vehiclee {
    @Override
    public void run() {
        System.out.println("Bus running");
    }
}
class Van extends Vehiclee {
    @Override
    public void run() {
        System.out.println("Van running");
    }
}

public class Overriding_Demo {
    public static void main(String[] args) {
        Vehiclee vehicle = new Caar();   // vehicle object of type Car
        vehicle.run();          //Car running
//        vehicle.config(); //Does not work

        vehicle = new Bus();    // vehicle object takes shape of type Bus
        vehicle.run();          //Bus running

        vehicle = new Van();    // vehicle object takes shape of type Van
        vehicle.run();          //Van running
    }
}
