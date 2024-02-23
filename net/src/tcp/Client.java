package tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket(InetAddress.getByName("ss"), 2024);
        OutputStream o = s.getOutputStream();
        o.write("凡人修仙传".getBytes());
        o.close();
        s.close();
    }
}
