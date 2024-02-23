package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        /*
        找快递公司   创建接收端的DatagramSocket对象
        接收箱子   接收打包好的数据
        从箱子里面获取礼物  解析数据包
        签收走人  释放资源
         */
        DatagramSocket ds = new DatagramSocket(2024);
        DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);
        /*
        receive方法是阻塞的
        程序执行到这一步的时候，会在这里死等发送端接收数据
         */
        System.out.println("1111111");
        ds.receive(dp);
        System.out.println("2222222");

        byte[] data = dp.getData();
        int len = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();

        System.out.println("接收到的数据为：" + new String(data, 0, len));
        System.out.println("该数据是从" + address + ":" + port + "发出的");

        ds.close();
    }
}
