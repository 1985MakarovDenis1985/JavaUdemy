package Arr;

import java.util.Arrays;

//// Немного длинновато
//@Test
//public void arraysDemo() {
//        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
//        List <int []> asList = Arrays.asList (arr); // Возвращаем список коллекций
//        // Arrays.sort (arr); // Пузырьковая сортировка
//        int binarySearch = Arrays.binarySearch (arr, 9); // Возвращает индекс позиции ключа, начиная с 0, sort () должен вызываться перед binarySearch (); в противном случае точность результата не гарантируется
//        int [] copyOf = Arrays.copyOf (arr, 10); // Копируем и возвращаем массив указанной длины
//        int [] copyOfRange = Arrays.copyOfRange (arr, 0, 5); // Вернуться, чтобы скопировать содержимое указанного диапазона
//        String[] arr1 = { "C", "h", "e", "n", "g", "L", "o", "n", "g" };
//        String[] arr2 = { "C", "h", "e", "n", "g", "L", "o", "n", "g" };
//        boolean deepEquals = Arrays.deepEquals (arr1, arr2); // Подходит для сравнения вложенных массивов (глубоких массивов), двумерных массивов и т. д.
//        int deepHashCode = Arrays.deepHashCode (arr1); // Возвращает хэш-код в соответствии с «глубоким содержанием» указанного массива (алгоритм, который не является полностью уникальным)
//        String deepToString = Arrays.deepToString (arr1); // Возвращает строковое представление «глубокого содержимого» указанного массива
//        boolean equals = Arrays.equals (arr1, arr2); // возвращаем истину, если указанные массивы равны друг другу
//        // Arrays.fill (arr, 2); // Заменить все элементы в массиве указанным значением int
//        int hashCode = Arrays.hashCode (arr); // Возвращает хэш-код в соответствии с указанным массивом
//
//        /*
//         * parallelPrefix(int[] array, IntBinaryOperator op)
//         * Используйте предоставленную функцию для параллельного накопления каждого элемента данного массива (инструкции на официальном сайте), используя двоичный алгоритм
//         * Это означает, что я не слишком разбирался в этом, но это не имеет значения, вы можете попробовать. После некоторых экспериментов я обобщил правило (запустите и посмотрите результат), я делаю здесь умножение, и другие операции также в порядке:
//         * Первый раз - это умножение первого элемента и второго элемента, второй раз - это умножение третьего элемента и результата умножения одного-двух элементов и так далее.
//         *
//         */
//
//        System.out.println("-----------parallelPrefix---------");
//        Arrays.parallelPrefix (arr, new IntBinaryOperator () {// Анонимный внутренний класс
//@Override
//public int applyAsInt(int left, int right) {
//        System.out.println ("Влево:" + влево + "\ t  :" + вправо);
//        return left * right;
//        }
//        });
//        printArray (arr); // Обходим массив
//        System.out.println("----------parallelPrefix----------");
//        // Arrays.parallelPrefix(arr, (IntBinaryOperator) (left, right) -> left
//        // * right); // Лямбда-выражение, как и внутренний класс, будет представлено позже
//
//        /*
//         * parallelSetAll(double[] array, IntToDoubleFunction
//         * генератор) Используйте предоставленную функцию генератора, чтобы установить все элементы указанного массива параллельно для вычисления каждого элемента (инструкции на официальном сайте). Обход всех индексов элементов массива
//         */
//        System.out.println("\n--------parallelSetAll--------\n");
//        int[] arr3 = { 11, 91, 81, 71, 61, 51, 41, 31, 21, 11 };
//        Arrays.parallelSetAll(arr3, new IntUnaryOperator() {
//@Override
//public int applyAsInt(int operand) {
//        System.out.print(operand + ",");
//        return operand;
//        }
//        });
//        printArray(arr3);
//        System.out.println("\n--------parallelSetAll--------");
//
//        // parallelSort (int [] a) сортирует указанный массив в порядке возрастания.
//        int[] arr4 = { 11, 91, 81, 71, 61, 51, 41, 31, 21, 11 };
//        Arrays.parallelSort(arr4);
//        printArray(arr4);
//        System.out.println("\n--------setAll-----------\n");
//        /*
//         * setAll(int[] array, IntUnaryOperator
//         * generator) Используйте предоставленную функцию генератора, чтобы настроить все элементы указанного массива для вычисления каждого элемента. Разница: parallelSetAll - это параллельная настройка
//         */
//        int[] arr5 = { 11, 91, 81, 71, 61, 51, 41, 31, 21, 11 };
//        Arrays.setAll(arr5, new IntUnaryOperator() {
//@Override
//public int applyAsInt(int operand) {
//        return operand;
//        }
//        });
//        printArray(arr5);
//        System.out.println("\n--------setAll-----------");
//
//        int[] arr6 = { 11, 91, 81, 71, 61, 51, 41, 31, 21, 11 };
//        OfInt spliterator = Arrays.spliterator (arr6); // Вернуть spliterator.OfInt, чтобы охватить все содержимое указанного массива.
//        System.out.println ("\ nspliterator length:" + spliterator.estimateSize ()); // возвращает количество элементов разделителя
//        System.out.println("\n--------tryAdvance-----------");
//        while (spliterator.estimateSize() > 0) {
//        spliterator.tryAdvance((IntConsumer) value -> {
//        System.out.print (value * 2 + ""); // Обрабатываем оставшиеся элементы и возвращаем true, иначе возвращаем false
//        });
//        }
//
//        spliterator.forEachRemaining ((IntConsumer) value -> System.out.print (value + "")); // Обходим Spliterator
//        int[] arr7 = { 11, 91, 81, 71, 61, 51, 41, 31, 21, 11 };
//        String string = Arrays.toString (arr7); // Преобразуем указанный массив в String
//
//        }
///**
// * Обойти массив
// */
//public void printArray(int[] arr) {
//
//        System.out.print("{");
//
//        for (int i = 0; i < arr.length; i++) {
//        if (i == arr.length - 1) {
//        System.out.print(arr[i]);
//        } else {
//        System.out.print(arr[i] + ",");
//        }
//        }
//        System.out.println("}");
//        }



public class SortArr {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {11, 22, 33, 44, 55};

//        1 2  22 33 44 55
        System.arraycopy(b,1, a,2, b.length-1);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
