package intializer;

// ИНИЦИАЛИЗАТОР
public class Initializer {
    String s1;

    Initializer() {
        System.out.println(" Constructor");
        // => (1) "Static block 1" (один раз)
        // => (2) "Init block 1"
        // => (3) "Constructor"
    }

    /*
        =====================================================================================
        initializer block => срабатывает каждый раз когда создается новый объект
        срабатывает перед конструктором а уже за ним срабатывает конструктор
    */ { // => initializer block
        System.out.println("Init block 1");
    }

    /*
         =====================================================================================
         static initializer block => срабатывает один раз когда класс загружается в память
         - нельзя обращатся к нестатическим переменным
    */
    static { // => static initializer block (срабатывает самый первый)
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        Initializer init = new Initializer();
        Initializer init_2 = new Initializer();
    }
}

//  ==================================== Initializer 2 ======================================= //

class B {
    static int a;
    static final int b = 1;
    static final int c;

    static {
        a = 1;
//      b = 2; // будет ругаться так как final b инициализирован сверху
        c = 3;
    }
}

//  ==================================== Initializer 3 ======================================= //

class С {
    // ========== 1 =========== //
    String s = "string";                        // 4
    { System.out.println(s); }                  // 5
    static int i = 0;                           // 1
    static { System.out.println(i); }           // 2
    static { i = i+1; System.out.println(i); }  // 3
    С() { System.out.println("constructor"); }  // 6
    public static void main(String[] args) {
//        С с = new C();
    }
}