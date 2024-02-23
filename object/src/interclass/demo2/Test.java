package interclass.demo2;

public class Test {
    public static void main(String[] args) {
        Outer.Inter oi = new Outer.Inter();
        oi.show1();
        Outer.Inter.show2();
    }
}
