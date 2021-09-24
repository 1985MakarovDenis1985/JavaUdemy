package listerator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorApp {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }
        System.out.println(list);

        ListIterator <Character> iterator = list.listIterator();
        ListIterator <Character> reversIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && reversIterator.hasPrevious()){
            if (iterator.hasNext() != reversIterator.hasPrevious()){
                isPalindrome = false;
            }
        }
        if (isPalindrome){
            System.out.println("true");

        }

    }
}
