package Lesson_11;

public class Car {
    String color;
    String engine;
    int hp = 240;

    public int HP(int a) {
        return this.hp = a;
    }

    public static void carColor(Car a, Car b) {
        a = b;
        System.out.println(a.color);
    }
}

class Controller {
    public static void main(String[] args) {
        Car newCar = new Car();
        newCar.color = "green";
        Car newCar2 = new Car();
        newCar2.color = "darkWhite";
        newCar.HP(320);
        System.out.println(newCar.hp);
        System.out.println(newCar2.hp);

        Car.carColor(newCar, newCar2);
        System.out.println(newCar);

    }
}
