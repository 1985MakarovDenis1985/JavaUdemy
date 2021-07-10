package Str.part2;


public class StrPart2 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuilder sb3 = new StringBuilder(5);
        StringBuilder sb4 = new StringBuilder(sb2);
        System.out.println(sb2.capacity());  // 21 (16 + str.length)

        System.out.println(sb2.length()); // 5
        System.out.println(sb2.charAt(1)); // e
        System.out.println(sb2.indexOf("l")); // 2
        System.out.println(sb2.indexOf("l", 3)); // 3 начиная со третего индекса
        String s = sb2.substring(3); // 'lo' (start)
        System.out.println(sb2.substring(1,4)); // ell (start, end)
        sb2.append(", How are you?"); // "Hello, How are you?"
        sb2.insert(5, "  Good day!"); // Hello  Good day!, How are you? (start, smt...)
        sb2.delete(5, 16); // "Hello, How are you?" (start, end)
        sb2.deleteCharAt(0); // ello, How are you? (index)
        sb2.reverse(); // revers
        sb2.reverse().replace(0,4, "Hey"); // Hey, How are you? (start, end, smt...)
        System.out.println(sb2);

        String a = new String("asd");
        String b = "asd"; // создался новый обьект
        System.out.println(a==b); // false => два разных объекта
        System.out.println(a.equals(b)); // true => одинаковое содержимое





    }
}
