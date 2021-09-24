package Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetApp {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student stu1 = new Student("John", 10);
        Student stu2 = new Student("Smith", 3);
        Student stu3 = new Student("Pony", 11);
        Student stu4 = new Student("Liza", 32);
        Student stu5 = new Student("Mat", 17);

        treeSet.add(stu1);
        treeSet.add(stu2);
        treeSet.add(stu3);
        treeSet.add(stu4);
        treeSet.add(stu5);

//        System.out.println(treeSet); // обязательно нужен компоратор
//        System.out.println(treeSet.first()); // first
//        System.out.println(treeSet.last()); // last

        Student temp = new Student("Sam", 11);
        Student temp2 = new Student("Sam", 19);

        System.out.println( treeSet.headSet(temp) ); // headSet -> покажет всех до курса 11 (как отсортировал компорптор)
        System.out.println( treeSet.tailSet(temp) ); // tailSet -> покажет всех после курса 11-включая (как отсортировал компорптор)
        System.out.println( treeSet.subSet(temp, temp2) ); // subSet -> покажет всех между 11 - 19-не включая (как отсортировал компорптор)



    }
}

class Student implements Comparable<Student>{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}' + "\n";
    }
}
