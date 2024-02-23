package tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(2024);
        Socket accept = ss.accept();
        InputStreamReader isr = new InputStreamReader(accept.getInputStream());
        int b;
        while ((b = isr.read()) != -1) {
            System.out.print((char) b);
        }
        OutputStreamWriter osw = new OutputStreamWriter(accept.getOutputStream());
        osw.write("HTTP/1.1 200 Accepted\n");
        osw.write("\n");
        osw.write("Hello World!");
        osw.flush();
        osw.close();
        isr.close();
        accept.close();
        ss.close();
    }
}
