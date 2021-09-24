package Set;

import java.util.HashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        // --- SET --- //
        Set<String> set = new HashSet<>();
        set.add("BMW");
        set.add("Audi");
        set.add("VW");
        set.add("Audi"); // дубликат не возможен
        set.add(null); // возможен
        set.remove("Audi");

//        System.out.println(set);
//        System.out.println(set.isEmpty());
//        System.out.println(set.contains("VW"));

        // --- HASH SET --- //
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(1);
        hashSet1.add(8);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(3);
        hashSet2.add(5);
        hashSet2.add(8);

        HashSet<Integer> union = new HashSet<>(hashSet1);
        HashSet<Integer> intersect = new HashSet<>(hashSet1);
        HashSet<Integer> subTract = new HashSet<>(hashSet1);


//        union
        union.addAll(hashSet2); // обьеденили все элименты без дубликатов
        System.out.println(union); // [1, 2, 3, 4, 5, 7, 8]

//        intersect
        intersect.retainAll(hashSet2); // пересечение
        System.out.println(intersect); // [3, 5, 8]

//        subtract
        subTract.removeAll(hashSet2); // удаляем из коллекции все ел которые нах в hashSet2
        System.out.println(subTract); // [1, 2]

    }
}
