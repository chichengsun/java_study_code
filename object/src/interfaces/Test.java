package interfaces;

public class Test {
    public static void main(String[] args) {
        Rabbit r = new Rabbit("ss", 18);
        System.out.println(r);
        r.eat();

        Frog f = new Frog("jj", 28);
        System.out.println(f);
        f.eat();
        f.swim();

        Dog d = new Dog("zz", 22);
        System.out.println(d);
        d.eat();
        d.swim();
    }
}
