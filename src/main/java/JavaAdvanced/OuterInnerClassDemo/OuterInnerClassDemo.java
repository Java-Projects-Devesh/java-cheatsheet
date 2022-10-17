package JavaAdvanced.OuterInnerClassDemo;

class OuterClass{
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

public class OuterInnerClassDemo {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();

        //To create InnerClass Object we need OuterClass object
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.showInner(); //Inside Inner Class: 10

        //To create InnerStaticClass object we dont need object of Outer class but class itself
        OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
        innerStaticClass.showInnerStatic(); //Inside Inner Static Class: 15
    }
}
