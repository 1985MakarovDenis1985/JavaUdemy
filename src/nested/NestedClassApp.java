package nested;

public class NestedClassApp {
    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(256);
        Car car = new Car("blue", 5, e);
        System.out.println(car);

    }
}

class Car {
    String color;
    int doors;
    Engine engine;

    public Car(String color, int doors, Engine engine) {
        this.color = color;
        this.doors = doors;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car : " +
                "color='" + color + '\'' +
                ", doors=" + doors +
                ", engine=" + engine + "\n";
    }

    public static class Engine{
        int hp;

        public Engine(int hp) {
            this.hp = hp;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "hp=" + hp +
                    '}';
        }
    }
}
