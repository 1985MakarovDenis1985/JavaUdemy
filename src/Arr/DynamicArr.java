package Arr;

import java.sql.Array;
import java.util.Arrays;

public class DynamicArr {

    public static void main(String[] args) {
        int[] arr = {1, 5, -7, 3, 9, 8};
        int[] arr2 = {1, 5, -7, 3, 9, 8};

        char[] arr3 = {'H','e','l','l','o'};
        String str = new String(arr3); // создали массив
        System.out.println(str);
        StringBuilder sb = new StringBuilder("Hello Word ");
        sb.append(arr3, 0, 5); // (c какогг массива вырезаем, start, кол символов)
        System.out.println(sb);
        sb.insert(2,arr3,0,2); // (start el, c какогг массива вырезаем, start, кол символов)
        System.out.println(sb);

        System.out.println(arr.equals(arr2)); // не работает для массивов как на String
        Arrays.sort(arr); // sort
        int a = Arrays.binarySearch(arr, 4); // бинарный поиск, если нет эл -позиция на которой но должен находтся;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }

}
