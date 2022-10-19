package Java_Basics_And_Intermediate;

import java.util.Arrays;

class Calculator {
    public void displaySum(int... n) { //variable n is accepted as an array here [4, 5, 1, 3]
        int sum = 0;
        for (int i : n) {
            sum = sum + i;
        }
        System.out.println(Arrays.toString(n)); //[4, 5, 1, 3]
        System.out.println(sum); //13
    }
}

public class Varargs_Demo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.displaySum(4,5,1,3);
    }
}
