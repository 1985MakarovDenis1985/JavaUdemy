package generics;

public class GenericApp {

    public static void main(String[] args) {
        Info<String> g = new Info<>("Hello");

    }
}

class Info <T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }
}
