package Streams.Specialists;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class SpecApp {
    public static void main(String[] args) {
        List<Specialist> people = new ArrayList<>();
        people.add(new Specialist("John", new BigDecimal(5000), Speciality.ENGINEER, 31));
        people.add(new Specialist("Sam", new BigDecimal(4000), Speciality.ENGINEER, 35));
        people.add(new Specialist("Anna", new BigDecimal(3000), Speciality.DEVOPS, 28));
        people.add(new Specialist("Tom", new BigDecimal(2000), Speciality.DEVOPS, 29));
        people.add(new Specialist("Mary", new BigDecimal(15000), Speciality.MANAGER, 31));
        people.add(new Specialist("Simon", new BigDecimal(10000), Speciality.MANAGER, 38));

        // ---------- sort --------- //

//        List<Specialist> sortedName = people.stream()
//                .sorted(Comparator.comparing(Specialist::getName)) // .reversed()
//                .collect(Collectors.toList());
//        System.out.println(sortedName);


        // method in class
//        public static List<Specialist> spec(List<Specialist> spc, Speciality spt){
//            return spc.stream()
//                    .filter(s -> s.getSpeciality().equals(Speciality.MANAGER))
//                    .collect(Collectors.toList());
//        }

        // ---------- filter by specialization --------- //

//        List<Specialist> sortedProf = people.stream()
//                .filter(s -> s.getSpeciality().equals(Speciality.MANAGER))
//                .collect(Collectors.toList());
//        System.out.println(sortedProf);

        // ---------- max salary --------- //

//        Specialist maxSpec = people.stream()
//                .max(Comparator.comparing(Specialist::getSalary))
//                .orElse(null); // orElse возвращает Optional
//        System.out.println(maxSpec);

        // ---------- MAP-> key : Spec, value : List with same specialization --------- //

//        Map<Speciality, List<Specialist>> groupBySpec = people.stream()
//                .collect(Collectors.groupingBy(Specialist::getSpeciality));
//        System.out.println(groupBySpec.get(Speciality.ENGINEER));

        // ---------- allMatch --------- //

//        boolean res = people.stream()
//                .allMatch(e -> e.getSpeciality().equals(Speciality.DEVOPS));
//        System.out.println(res);

        // ---------- anyMatch --------- //

//        boolean res = people.stream()
//                .anyMatch(e -> e.getSpeciality().equals(Speciality.DEVOPS));
//        System.out.println(res);

        // ---------- all people have salary > 5000 --------- //

//        boolean res = people.stream()
//                .allMatch(e -> e.getSalary().compareTo(new BigDecimal(5000))> 0); // > 0 - возврат compareTo (0 , -1, 1)
//        System.out.println(res);

        // ---------- takeWhile - пока не наткнется на age 38 (не соответствуют условию) --------- //

//        people.stream().takeWhile(e -> e.getAge() < 38).forEach(System.out::println);

        // ---------- takeWhile - пока не наткнется на age 38 (соответствуют условию) --------- //

//        people.stream().dropWhile(e -> e.getAge() < 38).forEach(System.out::println);

        // ---------- IntSummaryStatistics --------- //

        IntSummaryStatistics summaryStatistics = people.stream()
                .mapToInt(Specialist::getAge)
                .summaryStatistics();
        System.out.println(summaryStatistics);


    }
}

class Specialist {
    private String name;
    private BigDecimal salary;
    private Speciality speciality;
    private int age;

    @Override
    public String toString() {
        return "Specialist{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", speciality=" + speciality +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Specialist(String name, BigDecimal salary, Speciality speciality, int age) {
        this.name = name;
        this.salary = salary;
        this.speciality = speciality;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

}

enum Speciality {
    ENGINEER, MANAGER, DEVOPS
}