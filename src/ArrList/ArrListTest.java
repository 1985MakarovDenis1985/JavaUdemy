package ArrList;
import java.util.ArrayList;
import java.util.List;

public class ArrListTest {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("privet");
        Car car = new Car();
        list.add(car);
        Student student = new Student();
        list.add(student);
        list.add(new StringBuilder("ok"));
        System.out.println(list);

        ArrayList <String> list2 = new ArrayList <> (30); // так лучше
//        ArrayList <String> list2 = new ArrayList<String>();

        list2.add("hello");
//        list2.add(student); // не может так как тип данных разрешен только тот который указанный в конструкторе

        List <StringBuilder> list3 = new ArrayList <> (); // тоже коректно
//        list3.add(new StringBuilder("ok"));

//        ArrayList <Data Type> list11 = new ArrayList <> (55);
//        ArrayList <Data Type> list22 = new ArrayList <> (list11); // создается такой же обьект но уже новый!!!


    }
}

class Car{}
class Student{}
