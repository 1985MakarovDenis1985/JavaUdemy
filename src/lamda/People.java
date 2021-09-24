package lamda;

import java.util.Comparator;

public class People implements Comparable {
    int age;
    int iq;

    public People(int age, int iq) {
        this.age = age;
        this.iq = iq;
    }

    @Override
    public String toString() {
        return "People: " +
                "age=" + age +
                ", iq=" + iq;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

interface sortArr{
    boolean test(People person);
}
