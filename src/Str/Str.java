package Str;

import java.util.Locale;

public class Str {



    public static void main(String[] args) {
        //String сам ни когда не меняется - inutable
        String s1 = new String("Hello");
        int l = s1.length();
        char c1 = s1.charAt(4); // показывает элимен под индексом
        int i1 = s1.indexOf("Hel");
        int i2 = s1.indexOf("o", 3); // с какого элемента нужно начать поиск
        boolean i3 = s1.startsWith("H");// начинается ли строка с данного значения
        boolean i4 = s1.startsWith("l", 2);// (true - false) начинается ли строка с данного значения c определенного места
        boolean i5 = s1.endsWith("o");// заканчивается ли строка с данного значения

        String i6 = s1.substring(1);// отрезает кусок
        String i7 = s1.substring(1, 4);// отрезает кусок с определенног элемента

        String i8 = s1.trim(); // убирает пробелы по краям (strip)
//        String i8 = s1.stripLeading(); // убирает пробел с начала
//        String i8 = s1.stripTrailing(); // убирает пробел c конца

        String i9 = s1.replace("Hel", "hen"); //меняет первую часть на вторую

        String i10 = s1.concat(" World");
        String i11 = s1.toLowerCase();
        String i12 = s1.toUpperCase();

        boolean i13 = s1.contains("o"); // возвращает - хранит ли он в себе данное значение
        String s14 = new String("abc");
        String s15 = new String("abc");
//        System.out.println(s14 == s15); // два разный обьекта => false
//        System.out.println(s14.equals(s15)); // экуалс сравнивает их содержимое => true

        String s16 = "abcd";
        String s17 = "abcd";
//        System.out.println(s16 == s17); // true так как объекты были созданы без указания new а значит с одинаковым значением это ссылки на первые созданный объект

        String i18 = s1.concat(" World");
        String i19 = s1.concat(" world");
//        System.out.println(i18.equalsIgnoreCase(i19)); // сравнивает без учета регистра

        String s20 = " ";
        System.out.println(s20.isBlank()); // true если строка состоит из пробел / таб и тому бодобные
        System.out.println(s20.isEmpty()); // true если не пустая



//        System.out.println(i13);
//        System.out.println(s1);

    }
}
