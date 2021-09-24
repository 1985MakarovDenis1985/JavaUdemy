package Streams;

import java.util.stream.Stream;

public class DistinctApp {

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 1, 3);
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 1, 3, 4);
        stream2.distinct().forEach(System.out::println); // уникальные элименты
    }


}
