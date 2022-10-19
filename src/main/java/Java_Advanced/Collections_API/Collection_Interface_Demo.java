package Java_Advanced.Collections_API;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_Interface_Demo {
    public static void main(String[] args) {
        Collection collection = new ArrayList<String>();
        collection.add("10");
        collection.add("15");
        collection.add("16");

        collection.forEach(System.out::println);
        System.out.println(collection);
    }
}
