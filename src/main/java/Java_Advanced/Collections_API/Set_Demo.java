package Java_Advanced.Collections_API;

import java.util.*;

public class Set_Demo {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(5,6,8,2,6,2,3);
        List<String> namesList = Arrays.asList("Devesh","Priyanka","Sumit","Devesh");
        List<House> houseList = new ArrayList<>();

        houseList.add(new House(3, "red", 10000));
        houseList.add(new House(1, "white", 5000));
        houseList.add(new House(1, "white", 5000));
        houseList.add(new House(2, "green", 12000));
        houseList.add(new House(4, "orange", 9000));
        houseList.add(new House(4, "orange", 9000));

        houseList.forEach(System.out::println);
        intList.forEach(System.out::println);
        namesList.forEach(System.out::println);

        Set<Integer> intSet = new HashSet<>(intList);
        Set<String> namesSet = new TreeSet<>(namesList);
        Set<House> houseSet = new HashSet<>(houseList);

        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("-------------------------");

        intSet.forEach(System.out::println);
        namesSet.forEach(System.out::println);
        houseSet.forEach(System.out::println);
    }
}
