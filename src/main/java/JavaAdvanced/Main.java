package JavaAdvanced;

import JavaAdvanced.StreamsFromAmigo.beans.Car;
import JavaAdvanced.StreamsFromAmigo.beans.Person;
import JavaAdvanced.StreamsFromAmigo.mockdata.MockData;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Person> people = MockData.getPeople();
        List<Car> cars = MockData.getCars();

        System.out.println(people.get(10));
        System.out.println(cars.get(10));

    }

}