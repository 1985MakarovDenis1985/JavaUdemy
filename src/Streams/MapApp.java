package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class MapApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("hello");
        list.add("Hey");
        list.add("WatsUp");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }

        List<Integer> listInt = list.stream() // list не меняется
                .map(el -> el.length())
                .collect(Collectors.toList());
//        System.out.println(listInt);

        int[] ints = {5, 9, 3, 8, 1};
        ints = Arrays.stream(ints)
                .map(el -> {
                    if (el % 3 == 0) {
                        el = el / 3;
                    }
                    return el;
                }).toArray();
//        System.out.println(Arrays.toString(ints));

        Set<String> set = new TreeSet<>();
        set.add("WatsUpGirls");
        set.add("privet!!!");
        set.add("hello");
        set.add("Hey");
        set.add("WatsUp");
        set.add("WatsUpBoys");

        System.out.println(set.toString());

        Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        List<Integer> list1 = set.stream().map(e -> e.length()).collect(Collectors.toList());

        System.out.println(set2);
        System.out.println(list1);



    }
}
