package predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Boston");
        al.add("Atlanta");
        al.add("New York");
        al.add("Chicago");
        al.add("Washington");
        al.add("Detroit");
        //        al.removeIf(el -> el.length() < 8);

        Predicate<String> p = element -> element.length() < 8;
        al.removeIf(p);

//        Predicate<String> p1 = element -> element.length() < 8;
//        Predicate<String> p2 = element -> element.length() > 5;
//        testAl(al, p1.and(p2)); // объединем два
//        testAl(al, p1.negate); // антоним p1


        System.out.println(al);
    }
}
