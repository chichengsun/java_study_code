package extend.demo2;

public class Test {
    public static void main(String[] args) {
        Manager m1 = new Manager("001", "ss", 20000, 10000);
        System.out.println(m1.getId() + ", " + m1.getName() +
                ", " + m1.getSalary() + ", " + m1.getBonus());
        m1.work();
        m1.eat();

        Cook c1 = new Cook();
        c1.setId("002");
        c1.setName("zjj");
        c1.setSalary(40000);
        System.out.println(m1.getId() + ", " + m1.getName() +
                ", " + m1.getSalary());
        c1.work();
        c1.eat();
    }
}
