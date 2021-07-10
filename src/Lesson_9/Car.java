package Lesson_9;

public class Car {

    public static void main(String[] args) {
        Car newCar = new Car("red", "V8");
        System.out.println(newCar.color);
        newCar.changeColor2("white");
        System.out.println(newCar.color);

    }


    String color;
    String engine;
    static int count; // => статичная переменнпя пренадлежит всему классу а не каждому созданному обьекта
    Car(String color, String engine){
        count++;
        this.color = color;
        this.engine = engine;
    }
    public void showCar(){
        System.out.println("Color: " + color);
        this.changeColor2("green");
    }
    void changeColor2(String col){
        System.out.println(col);
        color = col;

    }
    public void changeColo1(String clr){
        System.out.println("Color will: " + clr);
        int price = 5000;
        color = clr;
        price += 1000;
    }
}
