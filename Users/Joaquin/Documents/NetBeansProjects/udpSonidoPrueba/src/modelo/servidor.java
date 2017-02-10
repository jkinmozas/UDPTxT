package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 *
 * @author Joaquin
 */
public class servidor {
    public void servidor (File f) throws IOException{
        MulticastSocket send = new MulticastSocket();
        byte[] data = new byte[(int) f.length()];
        FileInputStream fis = new FileInputStream(f);
        fis.read(data);
        fis.close();
        DatagramPacket dgp = new DatagramPacket(data, data.length,InetAddress.getByName("230.0.0.1"), 60000);
        send.send(dgp);
    }

}
