package Java_Advanced.Streams_From_Amigo;

import java.util.*;
import java.util.stream.Collectors;

//enum Gender{
//    male,
//    female,
//    gay
//}
class Individual {
    int age;
    String gender;
    public Individual(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return age + " " + gender;
    }
}

public class StreamsDemo {
    public static void main(String[] args) {
        List<Individual> people =  new ArrayList<>();
        people.add(new Individual(10, "male"));
        people.add(new Individual(15, "female"));
        people.add(new Individual(20, "gay"));
        people.add(new Individual(5, "gay"));
        people.add(new Individual(7, "homo"));
        people.add(new Individual(17, "male"));

//        people.stream().filter(person -> person.getAge() >= 7)
//                .sorted((person1, person2) -> Integer.compare(person1.getAge(), person2.getAge()))
//                .sorted((person1, person2) -> person1.getGender().compareToIgnoreCase(person2.getGender())).toList()
//                .forEach(System.out::println);

        Map<String, List<Individual>> groupByGender = people.stream().collect(Collectors.groupingBy(person -> person.getGender()));
        groupByGender.keySet().forEach(key-> groupByGender.get(key).forEach(System.out::println));
    }
}
