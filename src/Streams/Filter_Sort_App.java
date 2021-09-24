package Streams;

import Str.Str;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class FilterApp {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Peter", 31, 80, "man"));
        students.add(new Student("Sonya", 23, 75, "woman"));
        students.add(new Student("John", 35, 85, "man"));
        students.add(new Student("Elza", 28, 80, "woman"));
        students.add(new Student("Sam", 31, 83, "man"));

//        students = students.stream()
//                .filter(el -> el.getAge() > 25 && el.getAvgGrate() < 83)
//                .collect(Collectors.toList());
//        System.out.println(students);
//
//        students = students.stream()
//                .filter(el -> el.getSex().equals("woman"))
//                .collect(Collectors.toList());
//        System.out.println(students);

//        Stream<Student> myStream = Stream.of(students.get(0), students.get(1), students.get(2), students.get(3));
//        myStream
//                .filter(el -> el.getAge() > 25 && el.getAvgGrate() < 83)
//                .collect(Collectors.toList());
//
//        students = students.stream()
//                .sorted((a, b) -> Integer.compare(a.getAge(), b.getAge()))
//                .collect(Collectors.toList());
//        System.out.println(students);

        // Chain

        students.stream()
                .map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                })
                .filter(el -> el.getSex().equals("woman"))
                .sorted((a, b) -> Integer.compare(a.getAge(), b.getAge()))
                .forEach(System.out::println);

    }

}

class Student {
    private String name;
    private int age;
    private double avgGrate;
    private String sex;


    public Student(String name, int age, double avgGrate, String sex) {
        this.name = name;
        this.age = age;
        this.avgGrate = avgGrate;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvgGrate() {
        return avgGrate;
    }

    public void setAvgGrate(double avgGrate) {
        this.avgGrate = avgGrate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", avgGrate=" + avgGrate +
                '}';
    }
}