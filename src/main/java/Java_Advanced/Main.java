package Java_Advanced;

import Java_Advanced.Streams_From_Amigo.beans.Car;
import Java_Advanced.Streams_From_Amigo.beans.Person;
import Java_Advanced.Streams_From_Amigo.mockdata.MockData;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Person> people = MockData.getPeople();
        List<Car> cars = MockData.getCars();

        System.out.println(people.get(10));
        System.out.println(cars.get(10));

    }

}