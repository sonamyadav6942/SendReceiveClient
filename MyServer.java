import java.io.*;
import java.net.*;
import java.util.Locale;

public class MyServer {
    public static void main(String[] args)throws IOException {
        System.out.println("Waiting for connection");
        ServerSocket ss = new ServerSocket(8888);
        while (true)
        {
            Socket s = ss.accept();
            BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String receivesentence = br1.readLine();
            String capitalsentence = receivesentence.toUpperCase(Locale.ROOT);
            System.out.println("Sent to client" +capitalsentence);
            DataOutputStream ds = new DataOutputStream(s.getOutputStream());
            ds.writeBytes(capitalsentence);

        }

    }
}