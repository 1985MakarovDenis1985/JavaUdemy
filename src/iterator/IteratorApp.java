package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorApp {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Denys");
        arrList.add("Valentyna");
        arrList.add("Shpana");
        arrList.add("monky");
        arrList.add("Cats");

        Iterator<String> iterator = arrList.iterator(); // одноразовый
        while (iterator.hasNext()) {
            if (iterator.next().equals("monky")) {
                iterator.remove();
            }
        }

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String str : arrList) {
                System.out.println(str);
        }
    }


}

