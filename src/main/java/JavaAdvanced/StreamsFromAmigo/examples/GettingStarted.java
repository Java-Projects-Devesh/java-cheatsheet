package JavaAdvanced.StreamsFromAmigo.examples;


import JavaAdvanced.StreamsFromAmigo.beans.Person;
import JavaAdvanced.StreamsFromAmigo.mockdata.MockData;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


public class GettingStarted {

    public void imperativeApproach() throws IOException {
        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people
        List<Person> people = MockData.getPeople();
//        List<Person> youngPeople = new ArrayList<>();
//        int limit = 10;
//        int counter = 0;
//        for (Person person : people) {
//            if (person.getAge() <= 18) {
//                youngPeople.add(person);
//                counter++;
//                if (counter == limit) {
//                    break;
//                }
//            }
//        }
//        youngPeople.forEach(System.out::println);

        people.stream().filter(person -> person.getAge() <=18).limit(10).collect(Collectors.toList()).forEach(System.out::println);

    }

    public void declarativeApproachUsingStreams() throws Exception {
        List<Person> people = MockData.getPeople();
        List<Person> youngPeople = people.stream()
                .filter(p -> p.getAge() <= 18)
                .limit(10)
                .collect(Collectors.toList());
        youngPeople.forEach(System.out::println);
    }
}
