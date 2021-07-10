package Lesson_9;

public class Student {
    String name;
    Student(String name){
        this.name = name;
    }
    static int a; // будет изменятся во всех экземплярах
    int b(int b) {
        a = b;
        return a;
    }
    void s(){
        System.out.println(a);
    }

}




class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student("Denys");
        Student stu2 = new Student("Valentyna");
//        Student stu3;
//        stu1.b(5);
//        stu1.s();
//        stu2.s();
        System.out.println(stu1.name);
        System.out.println(stu2.name);
    }
}