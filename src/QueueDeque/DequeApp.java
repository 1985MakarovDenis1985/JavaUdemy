package QueueDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeApp {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(3);
        dq.addFirst(5);
        dq.addLast(7);
        dq.offerFirst(1);
        dq.offerLast(8);
        System.out.println(dq); // [1, 5, 3, 7, 8]
        dq.remove();
        dq.removeFirst();
        dq.removeLast();
        dq.pollLast();
        dq.pollLast();
//        dq.getFirst();
//        dq.getLast();
        System.out.println(dq); // []


    }


}
