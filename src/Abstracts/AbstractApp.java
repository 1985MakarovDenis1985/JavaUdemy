package Abstracts;

public class AbstractApp {
    public static void main(String[] args) {

        Figura f1 = new Kvadrat();
        System.out.println(f1.colichestvoStoron); // => colichestvoStoron = 0 так как тип Figura - происходит компайл байндинг
        f1.ploshad(); // => colichestvoStoron = 4 произошел ран тайм байндинг
    }
}

abstract class Figura {
//    Figura(int colichestvoStoron){
//        this.colichestvoStoron = colichestvoStoron;
//    }
    int colichestvoStoron = 0;
    abstract void perimetr(); // abstract метод должен быть без тела
    abstract void ploshad();
    void show(){
        System.out.println("Figura: ");
    }
}

class Kvadrat extends Figura {
//    Kvadrat(int colichestvoStoron){
//        super(colichestvoStoron);
//        this.colichestvoStoron = colichestvoStoron;
//    }
    int colichestvoStoron = 4;
    int storona1 = 10;
    public void perimetr(){
        System.out.println("Perimetr Kvadrat: " + colichestvoStoron * storona1);
    }
    public void ploshad(){
        System.out.println("Perimetr Kvadrat: " + storona1 * storona1);
    }
}

class Prymougolnik extends Figura {
    int colichestvoStoron = 4;
    int storona1 = 10;
    int storona2 = 8;
    public void perimetr(){
        System.out.println("Perimetr Prymougolnik: " + 2 * (storona1 * storona2));
    }
    public void ploshad(){
        System.out.println("Perimetr Prymougolnik: " + storona1 * storona2);
    }
}

class Okrujnost extends Figura {
    int colichestvoStoron = 4;
    int radius = 3;
    public void perimetr(){
        System.out.println("Perimetr Okrujnost: " + 2 * 3.14 * radius);
    }
    public void ploshad(){
        System.out.println("Perimetr Okrujnost: " + 3.14 * radius * radius);
    }
}

abstract class Chetirexugolnick extends Figura {
    void def() {
        System.out.println("Chetirexugolnick : ");

    }
}