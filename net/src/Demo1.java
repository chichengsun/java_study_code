import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo1 {
    public static void main(String[] args) throws UnknownHostException {
        /*
        static InetAddress getByName(String host)  确定主机名称的ip地址，主机名称可以是机器名称，也可以是ip地址
        String getHostName()  获取此ip地址的主机名
        String getHostAddress()  返回文本显示中的ip地址字符串
         */

        InetAddress address = InetAddress.getByName("ss");
        System.out.println(address);

        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());
    }
}
