import java.net.*;


public class Server1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket sc = new DatagramSocket(1020);
        byte sendData[]= new byte[10];
        byte receiveData[] = new byte[10];
        while(true){
            DatagramPacket dprec = new DatagramPacket(receiveData, receiveData.length);
            sc.receive(dprec);
            String rad = new String(dprec.getData());
            double area = 3.14*Double.parseDouble(rad)*Double.parseDouble(rad);
            sendData = Double.toString(area).getBytes();
            InetAddress addrs = dprec.getAddress();
            int port = dprec.getPort();
            DatagramPacket dpSend = new DatagramPacket(sendData,sendData.length,addrs, port);
            sc.send (dpSend);

        }

        
    }
    
}
