package Java_Basics_And_Intermediate.Inheritance;

class Animal{
    private boolean private_variable; //Private variable accessible only within the class. Period!
    protected String protected_variable; //Protected accessible within the package and outside from child class.
    public int public_variable;     //Accessible everywhere.
    int default_Variable; //Accessible only within package
    static int static_Variable; // Can be accessed using class name
    public void parentClassMethod() { } // public method
    public static void staticParentClassMethod() { } // static method
}
class Dog extends Animal{
    int default_Variable;
    public void childClassMethod(){
        default_Variable = 5;           // assigning local DEFAULT variable

        super.default_Variable = 10;    //access & assign parent-class DEFAULT variable using SUPER
        super.parentClassMethod();      //access parent class method using SUPER
        super.protected_variable = "sam";  //access & assign parent PROTECTED variable using SUPER
        super.public_variable = 15;     //access & assign parent PUBLIC variable using SUPER

        //Parent Static Members
        Animal.static_Variable = 20;    //access & assign parent STATIC variable using CLASS NAME
        Animal.staticParentClassMethod(); //access & assign parent STATIC method using CLASS NAME
    }
}

