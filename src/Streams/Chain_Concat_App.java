package Streams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Chain_Concat_App {
    public static void main(String[] args) throws IOException {

        // Chain
//        int[] arr = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
//        arr = Arrays.stream(arr).sorted().toArray();
//        System.out.println(Arrays.toString(arr));

//        int res = Arrays.stream(arr)
//                .filter(e -> e % 2 == 1)
//                .map(e -> {
//                    if (e % 3 == 0) {
//                        e=e/3;
//                    }
//                    return e;
//                })
//                .reduce((acc, el) -> acc + el).getAsInt(); // getAsInt - верни как int
//        System.out.println(res);

        // Concat
//        Stream<Integer> stream1 = Stream.of(1, 2, 3);
//        Stream<Integer> stream2 = Stream.of(4, 5, 6);
//        Stream<Integer> stream3 = Stream.of(7, 8, 9);
//        Stream<Integer> stream4 = Stream.concat(stream2, stream3); // после concat нельзя вызвать другой метод
//        stream4.forEach(System.out::println);

// ========================= next ========================= //

//        IntStream
//                .range(1, 10) // диапозон 1 до 10
//                .skip(5) // пропустить первые пять
//                .forEach(System.out::println);

// ========================= next ========================= //

//        System.out.println(
//                IntStream
//                        .range(3, 7) // от 3 до 7 (невключая)
//                        .peek(e->System.out.println(e))
//                        .sum());

// ========================= next ========================= //

//        Stream.of( "Safta", "Imma", "Sabba", "Abba")
//                .sorted()
//                .findFirst()
//                .ifPresent(System.out::println); // Abba

// ========================= next ========================= //

//        String[] str = {"Ali", "Sam", "Bob", "Anet", "Babua", "Ben"};
//        Arrays.stream(str)
//                .filter(e -> e.startsWith("B"))
//                .sorted()
//                .forEach(System.out::println); // "Babua", "Ben", "Bob"

// ========================= next ========================= //

//        Arrays.stream(new int[] {2, 4, 6, 8, 10})
//                .map(e -> e * e)
//                .average()
//                .ifPresent(System.out::println);

// ========================= next ========================= //

//        List<String> people = Arrays.asList("Ali", "Sam", "Bob", "Anet", "Babua", "Ben");
//        people.stream()
//                .map(String::toLowerCase)
//                .filter(e -> e.startsWith("a"))
//                .forEach(System.out::println);

// ========================= next ========================= //

//        Stream<String> bands = Files.lines(Paths.get("bands.txt"));
//        bands
//                .sorted()
//                .filter(e -> e.length() < 5)
        //                .filter(e -> e.contains("ab))
//                .collect(Collectors.toList());
//                bands.forEach(System.out::println)
        // -----------------------------------------
// //             .forEach(System.out::println);
// //             bands.close();

// ========================= next ========================= //

//        Stream<String> bands = Files.lines(Paths.get("bands.txt"));
//        int row = (int) bands.stream()
//                .map(e -> e.split(","))
//                .peek(System.out::println)
//                .filter(e -> e.length > 2)
//                .count();
//        System.out.println(row);
//        row.close();

// ========================= next ========================= //

//    Stream<String> bands = Files.lines(Paths.get("bands.txt"));
//    bands
//            .map(x -> x.split(""))
//            .filter(x -> x.length > 3)
//            .filter(x -> Integer.parseInt(x[1]) > 15)
//            .forEach(x -> System.out.println(x[0] + " " + x[0]));
//    bands.close();

// ========================= next ========================= //

//       double total = Stream.of(7.3, 1.5, 4.8)
//               .reduce(0.0, (Double a, Double b) -> a + b);
//       System.out.println(total);

// ========================= next ========================= //

        IntSummaryStatistics summaryStatistics = IntStream.of(7, 2, 19)
                .summaryStatistics();
        System.out.println(summaryStatistics);  // {count=3, sum=28, min=2, average=9,333333, max=19}


    }
}
