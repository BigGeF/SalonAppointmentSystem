import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SalonServer {
    public static void main(String[] args) throws IOException {
        final int ACCOUNTS_LENGTH = 10;
        Salon salon = new Salon(ACCOUNTS_LENGTH);
        final int SALON_PORT = 8888;
        ServerSocket server = new ServerSocket(SALON_PORT);
        System.out.println("Waiting for clients to connect...");

        while (true) {
            Socket s = server.accept();
            System.out.println("Client connected.");
            SalonService service = new SalonService(s, salon);
            Thread t = new Thread(service);
            t.start();
        }
    }
}
