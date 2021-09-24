package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1000, "Denys");
        map.put(1111, "Valentyna");
        map.put(4756, "Nobody");
        map.put(2000, "Lapka");
        map.remove(4756); // удаляем по ключу
        map.putIfAbsent(2000, "Lapka 2"); // проверить - находится ли уже такой ключ и если да то не добавить
        System.out.println(map.get(2000)); // Lapka
        System.out.println(map.get(0000)); // null
        System.out.println(map.containsValue("Lapka")); // true
        System.out.println(map.containsKey(2000)); // true
        System.out.println(map.keySet()); // дает все ключи [1000, 1111, 2000]
        System.out.println(map.values()); // дает все значения [Denys, Valentyna, Lapka]

        Map<String, String> map2 = new HashMap<>();
        map2.put("Zlaya", "Lapka"); // )))

    }
}
