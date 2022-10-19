package Java_Advanced.Streams_From_Amigo.examples;

import java.util.Comparator;
import java.util.List;

public class MinMax {

    public void min() {
        List<Integer> numbers = List.of(1, 2, 3, 100, 23, 93, 99);
        Integer min = numbers.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);
    }

    public void max() {
        List<Integer> numbers = List.of(1, 2, 3, 100, 23, 93, 99);
        Integer max = numbers.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);
    }
}
