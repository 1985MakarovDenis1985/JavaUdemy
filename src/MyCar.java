

class Human {
    String name;
    MyCar car;
    BankAccount count;

    void info() {
        System.out.println("name: " + name);
        System.out.println("car: " + car.engine);
        System.out.println("bank: " + count.count + "$");

    }
}

class BankAccount{
    BankAccount(int newId, double newCount){
       id = newId;
       count = newCount;
    }
    double minus(double minus){
        return count = count - minus;
    }
    double plus(double plus){
        return count = count + plus;
    }
    int id;
    double count;
}

class MyCar {
    MyCar(String col, String eng) {
        color = col;
        engine = eng;
    }
    String color;
    String engine;
}

class HumanTest{
    public static void main (String[] args){
        Human h = new Human();
        h.name = "Denys";
        h.car = new MyCar("blue", "V8");
        h.count = new BankAccount(1, 7777778);
        h.count.minus(500);
        h.count.plus(999);
        h.info();
    }
}


//class ConstructorOfCars {
//    ConstructorOfCars(String col, String eng) {
//        color = col;
//        engine = eng;
//    }
//
//    String color;
//    String engine;
//}

//public class MyCar {
//    public static void main(String[] args) {
//        ConstructorOfCars motor = new ConstructorOfCars("green", "V8");
//        System.out.println(motor.engine);
//    }
//}