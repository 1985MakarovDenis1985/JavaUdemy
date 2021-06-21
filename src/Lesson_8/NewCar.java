package Lesson_8;

public class NewCar {
    String color = "Blue";
    String engine  = "V8";
    static int count; // => static говорит о том что является общей для всех обьектов
                        // может быть использован без создания обьекта классов
                        // могут быть использованы без создания обьекта класса а не static нет!

    public NewCar(String eng){
        count++;
        engine = eng;
    }
}

class Human {
    String name = "Denys";
    NewCar myCar = new NewCar("V12");
    NewCar myCar2 = new NewCar("V12");
    NewCar myCar3 = new NewCar("V12");

    public static void main(String[] args) {
        Human me = new Human();
        me.myCar.engine = "320HP";
        System.out.println(me.myCar.engine);
        System.out.println(NewCar.count);
    }
}
