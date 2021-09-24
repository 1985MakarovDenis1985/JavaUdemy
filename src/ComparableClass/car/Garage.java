package ComparableClass.car;

import lesson_7.A;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

public class Garage {
    public static void main(String[] args) {
        Car[] cars = new ComparableClass.car.Car[5];
        cars[0] = new ComparableClass.car.Car(1, "bwm", LocalDate.of(2019, 5, 11));
        cars[1] = new ComparableClass.car.Car(3, "citroen", LocalDate.of(2021, 5, 17));
        cars[2] = new ComparableClass.car.Car(2, "mercedes", LocalDate.of(2019, 1, 8));
        cars[3] = new ComparableClass.car.Car(5, "opel", LocalDate.of(2018, 5, 18));
        cars[4] = new ComparableClass.car.Car(4, "subaru", LocalDate.of(2019, 11, 21));

        Arrays.sort(cars, (a,b) -> (a.date.compareTo(b.date)));
        int n = Arrays.binarySearch(cars, cars[1]);
        System.out.println(n);


        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}

class Car implements Comparable <Car> {
    int id;
    String name;
    LocalDate date;

    public Car(int id, String name, LocalDate date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComparableClass.car.Car)) return false;
        ComparableClass.car.Car car = (ComparableClass.car.Car) o;
        return id == car.id && Objects.equals(name, car.name) && Objects.equals(date, car.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, date);
    }

    @Override
    public String toString() {
        return "Car : "
                + id +
                " | " + name + '\'' +
                " | " + date;
    }

    @Override
    public int compareTo(Car o) {
        return this.date.compareTo(o.date);
    }
}






