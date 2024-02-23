package interclass.demo1;

public class Car {
    private int a = 10;
    class Engine {
        private final int a = 20;
        public void show() {
            int a = 30;
            System.out.println(a);  // 30
            System.out.println(this.a);  // 20
            System.out.println(Car.this.a);  // 10
        }
    }
}
