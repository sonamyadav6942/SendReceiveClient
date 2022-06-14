// Java program to send and receive message from client

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args)throws IOException{
        System.out.println("Enter Message : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Sentence = br.readLine();
        Socket s = new Socket("local host",6666);
        DataOutputStream ds = new DataOutputStream(s.getOutputStream());
        ds.writeBytes(Sentence+'\n');
        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String receivesentence = br1.readLine();
        System.out.println("Receive from server in " +receivesentence);

    }
}