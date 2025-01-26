    
import java.net.*;
import java.util.Scanner;
import java.io.*;



public class Server2 {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1010);
        while (true){
            Socket cs = ss.accept();
            DataInputStream dis = new DataInputStream(cs.getInputStream());
            String userName =dis.readLine();
            String password = dis.readLine();
            PrintStream out = new PrintStream(cs.getOutputStream());
            double area = Integer.parseInt(len)*Integer.parseInt(bre);
            out.println(area);
            out.close();
            dis.close();
        }
        
    }
    
}

