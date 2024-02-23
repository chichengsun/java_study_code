public class Main {
    public static void main(String[] args) {
        method(() -> System.out.println("hello world!"));
    }

    public static void method(Swim s) {
        s.swimming();
    }

    @FunctionalInterface
    public interface Swim {
        void swimming();
    }
}