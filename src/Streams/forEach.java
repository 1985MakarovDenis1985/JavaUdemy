package Streams;

import lesson_7.A;

import java.util.Arrays;

public class forEach {
    public static void main(String[] args) {
        int[] ints = {5, 9, 3, 8, 1};
//        Arrays.stream(ints)
//                .forEach(el -> {
//                    el *= 2;
//                    System.out.println(el);
//                });
//        Arrays.stream(ints).forEach(el -> System.out.println(el));
//        Arrays.stream(ints).forEach(System.out::println);

        Arrays.stream(ints).forEach(Utils::myMethod); // same
        Arrays.stream(ints).forEach(el -> Utils.myMethod(el)); // same

    }
}

class Utils{
    public static void myMethod(int a){
        a = a+5;
        System.out.println(a);
    }
}
