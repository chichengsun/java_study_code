import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        Runtime r1 = Runtime.getRuntime();
//        r1.exit(0);
        System.out.println(r1.availableProcessors());
        System.out.println(r1.maxMemory() / 1024 / 1024);
        System.out.println(r1.totalMemory() / 1024 / 1024);
        System.out.println(r1.freeMemory() / 1024 / 1024);
        r1.exec("java -version");
    }
}
