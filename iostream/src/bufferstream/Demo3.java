package bufferstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("E:\\Java Code\\javaCode\\iostream\\src\\bufferstream\\b.txt"));
        bw.write("凡人修仙传");
        bw.newLine();
        bw.write("记住！败给我，是你此生唯一值得铭记知识！");
        bw.close();
    }
}
