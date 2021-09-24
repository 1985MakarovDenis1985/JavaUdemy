package ArrList.compareEndMismatch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CompareMismatch {


    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,5};
        char[] char1 = {'p', 'r', 'i', 'v', 'e', 't'};
        char[] char2 = {'p', 'r', 'i', 'v', 'i', 'e', 't'};

        /* если первый массив меньше второго вернет < 0 || одинаковые 0 || если второй массив меньше первого вернет  > 0 */
//        System.out.println(Arrays.compare(arr1, arr2));

        /* озвращает индекс с которого начинается несовпадение и если расхождений нет то -1 */
        System.out.println(Arrays.mismatch(arr1, arr2));




    }
}
