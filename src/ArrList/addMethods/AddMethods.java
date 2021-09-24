package ArrList.addMethods;

import java.util.*;

public class AddMethods {

    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList<>();
        all.add("one");
        all.add("two");
        all.add("three");
        all.add("four");
        all.add("five");

        ArrayList<String> all2 = new ArrayList<>();
        all2.add("one");
        all2.add("three");
        all2.add("five");

        // removeAll => из all удаляются все элименты которые содержит all2
//        all.removeAll(all2);
        // ==========================================

        // retainAll => в all сохранит все элименты которые содержит all2
//        all.retainAll(all2);
        // ==========================================

        // containsAll => true если all будет содержать в себе все элементы из all2
//        boolean res = all.containsAll(all2);
        // ==========================================

        /* sublist => создает (List) из ArrList из куска первого массива (start, end) idx
        не является отдельной сущьностью а только хранит в себе отрывок ссылок c которыми можно работать
        */
//        List <String> str = all.subList(1, 3);
//        str.add("ten"); // изменяем нормально
//        all.add("million"); // изменить нельзя exception
//        // ==========================================

        // toArray =>  создает массив из List
//        Object[] arr = all.toArray();

        // toArray =>  создает массив String из List
//        String[] arr2 = all.toArray(new String [5]);

        //  List.of => создает новый лист который нельзя модифицировать
//        List <String> list = List.of("one", "two", "three");
//
//        //  List.copyOf => создает новый лист который нельзя модифицировать из коллекции
//        List <String> list2= List.copyOf(all);
        // ==========================================

// Map => ключ - значение || перезаписать можно по ключу - дубликатов ключей не может быть
        Map<Integer, String> map = new HashMap<>();
        map.put(1000, "Denys");
        map.put(1111, "Valentyna");
        map.put(4756, "Nobody");
        map.put(2000, "Lapka");
        map.remove(4756); // удаляем по ключу
        map.putIfAbsent(2000, "Lapka 2"); // проверить - находится ли уже такой ключ и если да то не добавить
        System.out.println(map.get(2000)); // Lapka
        System.out.println(map.get(0000)); // null
        System.out.println(map.containsValue("Lapka")); // true
        System.out.println(map.containsKey(2000)); // true
        System.out.println(map.keySet()); // дает все ключи [1000, 1111, 2000]
        System.out.println(map.values()); // дает все значения [Denys, Valentyna, Lapka]


//        System.out.println(map);
    }
}
