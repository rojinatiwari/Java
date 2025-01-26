import java.io.*;
import java.net.*;
import java.util.*;




public class Client1 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        String rad = sc.next();
        byte[] sendData = new byte[10];
        sendData = rad.getBytes();
        InetAddress addrs = InetAddress.getByName("localhost");
        DatagramPacket dpSend = new DatagramPacket(sendData, sendData.length,addrs,1020);
        DatagramSocket cs = new DatagramSocket();
        cs.send(dpSend);
        byte[] receiveData = new byte[10];
        DatagramPacket dprec = new DatagramPacket(receiveData, receiveData.length);
        cs.receive(dprec);
        String res = new String (dprec.getData());
        System.out.println("The area of the circle is"+res);
        sc.close();

        
    }
    
}
