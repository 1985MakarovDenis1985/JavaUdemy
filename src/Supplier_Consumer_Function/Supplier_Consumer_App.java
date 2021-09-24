package Supplier_Consumer_Function;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Supplier_Consumer_App {

    public static ArrayList<Car> createCars(Supplier<Car> carSupplier) { // Supplier
        ArrayList<Car> all = new ArrayList();
        for (int i = 0; i < 3; i++) {
            all.add(carSupplier.get());
        }
        return all;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) { // Consumer
        carConsumer.accept(car);
    }

    private static double avgEngine(ArrayList<Car> list, Function<Car, Double> c) { // Function
        double res = 0;
        for (Car car : list) {
            res += c.apply(car);
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createCars(() -> new Car("Nissan", "white", 2.0)); // Supplier
        System.out.println(ourCars);

        changeCar(ourCars.get(0), car -> car.engine = 2.2); // Consumer
        System.out.println(ourCars);

        double res = avgEngine(ourCars, car -> car.engine); // Function
        System.out.println(res);

    }
}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
