package JavaAdvanced.collections;

import java.util.Arrays;
import java.util.List;

class Calc{
    public static int add(int a){
        System.out.println(a+2);
        return a + 2;
    }

    public int multiply(int a){
        System.out.println(a*2);
        return a * 2;
    }
}


public class SetDemo {
    public static void main(String[] args) {
        Calc calc = new Calc();

        List<Integer> list = Arrays.asList(2,3,4,5);
        list.forEach(e-> calc.multiply(e));
        list.forEach(e-> Calc.add(e));



    }
}
