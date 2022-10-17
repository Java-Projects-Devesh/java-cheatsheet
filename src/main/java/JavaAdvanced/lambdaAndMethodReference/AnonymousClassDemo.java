package JavaAdvanced.lambdaAndMethodReference;

class GenaricParentClass {
    int genaricParentClassNumber =5;
    public void printSthInGenaricParentClass() { System.out.println("Printing in GenaricParentClass.");}
    public static void staticMethodInGenaricParentClass() {
        System.out.println("I am static Method in GenaricParentClass");
    }
}
abstract class AbstractParentClass{
    int abstractClassNumber = 5;
    static String STATIC_STRING_IN_ABSTRACT_CLASS = "Static string in Abstract Class";
    public abstract void printSthInAbstractParentClass();
    public static void staticMethodInAbstractParentClass() {
        System.out.println("I am static Method in AbstractParentClass");
    }
}
interface ParentInterface{
    int interfaceNumber = 10;
    void printSthInParentInterface();
    default void defaultMethodInParentInterface(){
        System.out.println("Default method in Interface");
    }
    static void staticMethodInParentInterface() {
        System.out.println("I am static Method in ParentInterface");
    }
}

public class AnonymousClassDemo {
    public static void main(String[] args) {
        // anonymousClassObject_1 is Object of anonymous class extending GenaricParentClass
        GenaricParentClass anonymousClassObject_1 = new GenaricParentClass()
        {
            @Override
            public void printSthInGenaricParentClass() { //Overriding Parent class method
                super.genaricParentClassNumber +=5; //Accessing Parent class Variable
                GenaricParentClass.staticMethodInGenaricParentClass(); // Accessing Parent class Default method
                System.out.println("Anonymous class inheriting generic class");
            }
        };
        anonymousClassObject_1.printSthInGenaricParentClass();

        AbstractParentClass anonymousClassObject_2 = new AbstractParentClass() {
            @Override
            public void printSthInAbstractParentClass() { //Overriding Abstract class method
                System.out.println("Abstract class can be inherited by Anonymous class");
                System.out.println(super.abstractClassNumber);  // Using abstract class variable
                System.out.println(AbstractParentClass.STATIC_STRING_IN_ABSTRACT_CLASS); // Using static variable
                AbstractParentClass.staticMethodInAbstractParentClass(); // using Abstract class static method
            }
        };

        anonymousClassObject_2.printSthInAbstractParentClass();

        //Can also be simplified to Lambda
        ParentInterface anonymousClassObject_3 = () -> {
            System.out.println("Interface can also be inherited from anonymous class" );
            System.out.println(ParentInterface.interfaceNumber);//accessing interface variable
            System.out.println(ParentInterface.interfaceNumber); //accessing interface variable
            ParentInterface.staticMethodInParentInterface(); // accessing interface method
        };
        anonymousClassObject_3.defaultMethodInParentInterface(); //Default method can be called using sub-class object
        anonymousClassObject_3.printSthInParentInterface();
    }
}
