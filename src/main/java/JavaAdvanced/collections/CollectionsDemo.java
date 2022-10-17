package JavaAdvanced.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsDemo {
    public static void main(String[] args) {
        Collection list = new ArrayList<String>();
        list.add("10");
        list.add("15");
        list.add("16");


        list.forEach(item-> System.out.println(item));
        System.out.println(list);
    }
}
