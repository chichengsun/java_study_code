package byteandcharstream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class EncodeDecode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*
        java中编码的方法：
            public byte[] getBytes() 使用默认方式进行编码
            public byte[] getBytes(String charsetName) 使用指定方式进行编码
        java中解码的方法：
            String(byte[] bytes)  使用默认方式进行解码
            String(byte[] bytes, String charsetName) 使用指定方式进行解码
         */
        String string1 = "ai你哟";
        byte[] bytes1 = string1.getBytes();
        System.out.println(Arrays.toString(bytes1));

        byte[] bytes2 = string1.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));

        String str1 = new String(bytes1);
        System.out.println(str1);
        String str2 = new String(bytes1, "GBK");
        System.out.println(str2);

        String str3 = new String(bytes2);
        System.out.println(str3);
        String str4 = new String(bytes2, "GBK");
        System.out.println(str4);
    }
}
