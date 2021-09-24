package equalse;

import java.util.Objects;

class Car {

    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, engine);
    }
}

public class App {
    public static void main(String[] args) {
        Car car1 = new Car("red", "v8");
        Object car2 = new Car("red", "v8");
        Car car3 = new Car("blue", "v8");

        System.out.println(car1.equals(car2));


    }


}