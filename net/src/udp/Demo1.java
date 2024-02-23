package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        /*
        发送数据：
        找快递公司    创建发送端的DatagramSocket对象
        打包礼物      数据打包（DatagramPacket）
        快递公司发送包裹    发送数据
        付钱走人   释放资源
         */
        DatagramSocket ds = new DatagramSocket();
        String str = "你好呀！";
        byte[] bytes = str.getBytes();
        int port = 2024;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("ss"), port);
        ds.send(dp);
        ds.close();
    }
}
