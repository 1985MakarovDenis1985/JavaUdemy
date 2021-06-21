package Lesson_8;

public class NonModify {

//    public final int a = 10; // => final говорит о том, что значение переменной менятся не может(константа только для чтения)
    public final int a;


    // в разных класса можно задавать разное значение константе
    NonModify(){
        a = 10;
    }
    NonModify(boolean b){
        a = 15;
    }

    public static void main(String[] args) {
        NonModify test = new NonModify();
//        test.a = test.a * 2; // не пускает
        System.out.println(test.a);
    }

}
