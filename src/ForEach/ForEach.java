package ForEach;

public class ForEach {

    static void display(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");

        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8};
        for (int i : arr) {
            System.out.print(i + " "); // тоже что и arr[i] при обычном переборе
        }
        System.out.println();

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum); // тоже что и arr[i] при обычном переборе

        int[][] array = {{3, 4, 7}, {4, 5}, {9, 4, 6, 8, 3, 7}};
        for (int[] arrInside : array) {
            for (int el : arrInside) {
                System.out.print(el + " ");
            }
            System.out.println();
        }

        /*
        c помощью for each loop мы не иожем производить динамическую инициализацию массива
        так как изменяем только переменную b а не элимент массива
        не возможно изменить значения примитивов
        но возможно изменить значения ссылочных типов данных
        */

        int[] dig = {3, 4, 5};
        for (int i = 0; i < dig.length; i++) { // елементы переписались
            dig[i] = 1;
        }
        for (int i : dig) { // елементы НЕ переписались
            i = 1;
        }
        display(dig);

        int[] dig2 = new int[4];
        for (int i = 0; i < dig2.length; i++) { // елементы переписались
            dig2[i] += i*10;
        }
        display(dig2);

        int[] dig3 = new int[5];
        for (int b : dig3){  // елементы НЕ переписались
            b = 0;
        }
        display(dig3);


    }
}
