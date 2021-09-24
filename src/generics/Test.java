package generics;

import Str.Str;

import java.io.OptionalDataException;

public class Test {


    public static void main(String[] args) {
        Cat c1 = new Cat(3, "M");
        Cat c2 = new Cat(7, "A");
        Cat c3 = new Cat(4, "M");
        Cat c4 = new Cat(8, "A");
        Cat c5 = new Cat(1, "M");
        Cat[] cats = {c1, c2, c3, c4, c5};

        for (int i = 0; i < cats.length; i++) {


        }


    }

    public boolean find(Cat cat){
        return cat.getAge() < 5;
    }
}


class Cat {
    int age;
    String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
