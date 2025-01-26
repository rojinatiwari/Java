import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket cs = new Socket("localhost", 1010);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        String len = sc.nextLine();
        System.out.println("Enter the breadth of rectangle");
        String bre = sc.nextLine();
        PrintStream out = new PrintStream(cs.getOutputStream());
        out.println(len);
        out.println(bre);
        DataInputStream dis = new DataInputStream(cs.getInputStream());
        String area = dis.readLine();
        System.out.println("The area of the rectangle is" + area);

    }

}
