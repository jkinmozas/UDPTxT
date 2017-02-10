package modelo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 *
 * @author Joaquin
 */
public class cliente {
    public byte[] recibirdatos() throws IOException {
        MulticastSocket escucha = new MulticastSocket(60000);
        escucha.joinGroup(InetAddress.getByName("230.0.0.1"));
        
        byte[] dato = new byte[64024];
        
        DatagramPacket dgp = new DatagramPacket(dato, dato.length);
        escucha.receive(dgp);
        byte[] datorec = dgp.getData();
        return datorec;
        
    }

}
