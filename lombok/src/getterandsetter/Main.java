package getterandsetter;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("ss", 18, "hubei");
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getAddress());
        System.out.println(s);
    }
}
