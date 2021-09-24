package lamda;

import java.util.Arrays;
import java.util.Comparator;

public class PeopleApp {

    public static void main(String[] args) {
        People[] people = {
                new People(37, 86),
                new People(15, 91),
                new People(28, 78),
        };
        printPeople(people, el -> el.age < 30 );

    }

    static void printPeople(People[] people, PeopleTest test) {
        for (People p : people) {
            if (test.check(p)) {
                System.out.println(p);
            }
        }
    }
}

interface PeopleTest {
    boolean check(People people);
}

