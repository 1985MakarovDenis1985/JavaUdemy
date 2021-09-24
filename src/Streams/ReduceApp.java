package Streams;

import lesson_7.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceApp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int res = list.stream()
                .reduce((acc, el) -> acc*el)
                .get(); // get - метод Optional
        System.out.println(res);

        int res2 = list.stream()
                .reduce(1, (acc, el) -> acc*el);
//                .get(); // уже не нужен так как есть identity и null-а уже не будет

        List<String> strings = new ArrayList<>();
        strings.add("privet");
        strings.add("Hello");
        strings.add("Hey");

        String res3 = strings.stream()
                .reduce((acc, el) -> acc +  " " + el).get();
        System.out.println(res3);




//        List<Integer> list100 = new ArrayList<>();
//        Optional<Integer> o = list100.stream()
//                .reduce((acc, el) -> acc*el);
//        if (o.isPresent()){
//            System.out.println(o.get());
//        } else {
//            System.out.println("No present");
//        }
    }
}
