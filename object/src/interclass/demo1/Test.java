package interclass.demo1;

public class Test {
    public static void main(String[] args) {
        Car.Engine ce = new Car().new Engine();
        ce.show();
    }
}
