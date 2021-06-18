
// более правильное написание конструкторов c конца в начальную функцию

public class MethodOverloading {
    String setName;
    int setId;
    int setEge;

    MethodOverloading(int id) {
        this(null, id, 0);
    }

    MethodOverloading(String name, int id) {
        this(null, id, 0);
    }

    MethodOverloading(String name, int id, int age) {
        setId = id;
        setName = name;
        setEge = age;
    }
}


class MethodOverTest {
    public static void main(String[] arg) {
        MethodOverloading emp = new MethodOverloading("Hello", 1);
        System.out.println(emp.setEge);
    }
}



//public class MethodOverloading {
//
//    // можно создать метод с одинаковыми именами но с разными типами данных в параметрах || разных по количеству || разные порядки
//
////    void show(int i1){
////        System.out.println(i1);
////    }
////    void show(int i1, String i2){
////        System.out.println(i1 + "  " + i2);
////    }
////    void show(boolean b1){
////        System.out.println(b1);
////    }
////    void show(String c1){
////        System.out.println(c1);
////    }
//    String name;
//    int id;
//    int age;
//
//    MethodOverloading(int id1) {
//        id = id1;
//    }
//
//    MethodOverloading(String name1, int id) {
//        this(id);
//        name = name1;
//    }
//
//    MethodOverloading(String name, int id, int age1) {
//    // this - значит что вызывается конструктор с параметрами которые подходят
//        // this - должен всегда стоять в начале
//        this(name, id);
//        age = age1;
//    }
//}
//
//
//class MethodOverTest {
//    public static void main(String[] arg) {
//        MethodOverloading employer = new MethodOverloading("Hello", 1, 101);
//
//        System.out.println(employer.age);
////        MethodOverloading mO = new MethodOverloading();
////        int a = 500;
////        mO.show(a);
////        boolean b = true;
////        mO.show(b);
////        String c = "Hello";
////        mO.show(c);
////        mO.show(a, c);
//    }
//
//}
