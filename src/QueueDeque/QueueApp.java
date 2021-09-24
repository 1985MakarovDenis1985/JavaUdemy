package QueueDeque;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("BWM");
        q.add("Audi");
        q.add("VW");
        q.add("Opel");

//        System.out.println(q);
//        System.out.println(q.remove()); // rem BMW
//                                        // еслт очередь пустая уже верне exception;
//        q.remove("Audi"); // -> удалим audi
//        q.poll(); // как и ремув, но вместо exception вернет null\
//        System.out.println(q.element()); // первый элимент в очереди ->  "BMW"  еслт очередь пустая уже верне exception;
//        q.element(); // как и element(), но вместо exception вернет null\


        PriorityQueue<Integer> pq = new PriorityQueue<>(); // выводит элименты не по приоритету, а работает с нимми по приоритету
                                                            // так же работает с компаратором
        pq.add(4);
        pq.add(1);
        pq.add(7);
        pq.add(10);
        pq.add(8);

        System.out.println(pq.peek()); // 1
        System.out.println(pq.peek()); // remove 1


    }
}
