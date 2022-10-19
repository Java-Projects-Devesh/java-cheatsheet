package Java_Advanced.Inbuilt_Functional_Interfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
class Cat{}
class ConsumerImpl implements Consumer<Cat>{
    @Override
    public void accept(Cat cat) {
        System.out.println(cat);
    }
}
class SupplierImpl implements Supplier<Integer>{
    @Override
    public Integer get() {
        return 10;
    }
}
class PredicateImpl implements Predicate<Integer>{
    @Override
    public boolean test(Integer num1) {
        return num1 < 10 ? true : false;
    }
}
class FunctionImpl implements Function<Integer, String>{
    @Override
    public String apply(Integer integer) {
        return integer > 10 ? "Larger than 10":"Lesser than 10";
    }
}

public class Inbuilt_Functional_Interfaces {
    public static void main(String[] args) {
        //---------Consumer-----------
        ConsumerImpl consumer = new ConsumerImpl();
        consumer.accept(new Cat());

        Consumer<Integer> consumer1 = new Consumer<Integer>() {
            @Override
            public void accept(Integer num1) {
                System.out.println(num1);
            }
        };
        Consumer<Integer> consumer2 = (num1)-> System.out.println(num1+10);
        Consumer<String> consumer3 = (str)-> System.out.println(str + " : In Consumer.");
        Consumer<String> consumer4 = System.out::println;

        //---------Supplier-----------
        SupplierImpl supplier = new SupplierImpl();
        supplier.get();

        Supplier<String> supplier1 = ()-> "This is String Supplier";
        Supplier<Integer> supplier2 = ()-> 120;

        //---------Predicate-----------
        PredicateImpl predicate = new PredicateImpl();
        Predicate<Integer> predicate1 = (num1)-> num1 < 10 ? true : false;
        Predicate<String> predicate2 = (str)-> str == "hello" ? false : true;
        Predicate<Boolean> predicate3 = (str)-> true;

        //---------Function-----------
        Function<Integer, String> function1 = (num1)-> "Hello";
        Function<String, Integer> function2 = (str)-> 10;
        Function<Integer, String> function3 = (num1)-> num1 > 10 ? "Hello" : "Hi";
        Function<Boolean, String> function4 = (bool)-> bool ? "Hello" : "Hi";
        Function<Integer, Boolean> function5 = (num1)-> num1 > 10;
    }
}
