package ArrList;

import java.util.*;

public class MethodsArray {
    public static void main(String[] args) {
        // ================ add = добавляем эл на определенную позицию ================
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("by");
        list.add(1, "ok");

        // ================   size() = arr.length ================
        list.add(list.size(), "last by");

//        for (String i : list) {
//            System.out.println(i + " ");
//        }
//        System.out.println("================");
//        System.out.println(list.get(1)); // получаем эл

        // ================   set = заменяет 3 эл на новое значение ================
        String hello_again = list.set(3, "Hello again");

        // ================ append = добавить к строке / массиву ================
        ArrayList<StringBuilder> arrStr = new ArrayList<>(); // запись;
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("By");
        StringBuilder sb3 = new StringBuilder("Yhooo");
        arrStr.add(sb1);
        arrStr.add(sb2);
        arrStr.add(sb3);
        for (int i = 0; i < arrStr.size(); i++) {
            arrStr.get(i).append("!!!");
        }

        // ================ remove ================
        ArrayList<String> arrStr2 = new ArrayList<>(); // запись;
        arrStr2.add("Hello");
        arrStr2.add("By");
        arrStr2.add("Hey");
//        arrStr.remove(1); // ["Hello", "By", "Hey"] => ["Hello", "Hey"]
//        arrStr2.remove(new String("Hey")); // => ["Hello"]
//        System.out.println(arrStr2);


        // ================ addAll ================
        ArrayList<String> arrStr3 = new ArrayList<>(); // запись;
        arrStr3.add("Bla-bla");
        arrStr3.add("SMT");
//        arrStr2.addAll(arrStr3); // [Hello, By, Hey, Bla-bla, SMT]
//        System.out.println(arrStr2);

        // ================ clear ================
//        arrStr3.clear(); // => []
//        System.out.println(arrStr3);

        // ================ indexOf ================
        // возвращает индекс самого первого обнаруженного элимента
//        System.out.println(arrStr3.indexOf("SMT")); // [Bla-bla, SMT] => 1 (StringBuilder -> не найдет так как новый объект)
//        System.out.println(arrStr3.lastIndexOf("SMT")); // показывает последний индек найденого объекта

        // ================ isEmpty ================
//        System.out.println(arrStr3.isEmpty()); // пустой или нет массив (size == 0)

        // ================ Contains ================
//        System.out.println(arrStr3.contains("SMT")); // содержит ли массив такой объект

        // ================ toString ================
//        System.out.println(arrStr3.toString());

        // ================ clone ================
        ArrayList<StringBuilder> arrClone = new ArrayList<>(); // запись;
        StringBuilder sb111 = new StringBuilder("A");
        StringBuilder sb222 = new StringBuilder("B");
        StringBuilder sb333 = new StringBuilder("C");
        arrClone.add(sb111);
        arrClone.add(sb222);
        arrClone.add(sb333);

        ArrayList<StringBuilder> arrClone2 = (ArrayList<StringBuilder>) arrClone.clone(); // запись;
        // два разных объекто но все элименты массива ссылаются на одни и теже объекты
//        System.out.println(arrClone == arrClone2); // true -> одинаковое содержимое
//        System.out.println(arrClone.equals(arrClone2)); // false
        arrClone.get(0).append("!!!");// [A!!!, B, C]
        arrClone.set(0, new StringBuilder("D"));

//        System.out.println("clone1: " + arrClone); // [D, B, C]
//        System.out.println("clone1: " + arrClone2); // [A!!!, B, C]


        // ================ toArray ================
//        Object[] arr = arrClone.toArray(); // возвр массив данных
//        for (Object i : arr) {
//            System.out.print(i +" "); // A, B, C
//        }

//        StringBuilder[] strB = arrClone.toArray(new StringBuilder[5]); // возвращает типа данных который в параметрах
//        for (Object i : strB) {
//            System.out.print(i +" "); // A, B, C, null, null
//        }

        // ================ Array.asList ================
        StringBuilder[] array = {sb111, sb222, sb111, sb333};
        List<StringBuilder> list2 = Arrays.asList(array);
//        System.out.println("list2: "+list2);
//        array[0] = new StringBuilder("A"); // list2 также поменялись в отличии от .clone()s
//        System.out.println("list2: "+list2);


        // ================ Collection.sort ================
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("C");
        list3.add("A");
        list3.add("B");
        list3.add("R");
        list3.add("F");

//        Collections.sort(list3);
//        System.out.println(list3);


        // ================ equals ================
        ArrayList<String> list4 = list3;
//        System.out.println(list4 == list3); // true
//        System.out.println(list4.equals(list3)); // true

//        ArrayList<String> list5 = new ArrayList<>();
//        list3.add("C");
//        list3.add("A");
//        list3.add("B");
//        System.out.println(list5 == list3); // false
//        System.out.println(list5.equals(list3)); // false


        // ================ Iterators ================

        Iterator<String> it = list3.iterator();
//        System.out.println(it);
        // Iterator отличается от forEach тем, что можно удалить эл
        while (it.hasNext()) { // hasNext() если есть послед элимент
            System.out.print(it.next() + " | ");
            // удалить эл
            // it.next();
            // it.remove();
        }
    }
}
