package Java_Advanced.Outer_Inner_Class_Demo;

class Outer_Class {
    int num1 = 10;
    static int num2 = 15;
    class InnerClass{
        public void showInner() {
            System.out.println("Inside Inner Class: " + num1);
        }
    }
    static class InnerStaticClass{
        public void showInnerStatic() {
            System.out.println("Inside Inner Static Class: " + num2);
        }
    }
}

public class Outer_Inner_Class_Demo {
    public static void main(String[] args) {

        Outer_Class outerClass = new Outer_Class();

        //To create InnerClass Object we need OuterClass object
        Outer_Class.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.showInner(); //Inside Inner Class: 10

        //To create InnerStaticClass object we dont need object of Outer class but class itself
        Outer_Class.InnerStaticClass innerStaticClass = new Outer_Class.InnerStaticClass();
        innerStaticClass.showInnerStatic(); //Inside Inner Static Class: 15
    }
}
