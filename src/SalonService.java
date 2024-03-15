import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SalonService implements Runnable {
    private Socket s;
    private Scanner in;
    private PrintWriter out;
    private Salon salon;

    public SalonService(Socket aSocket, Salon aSalon) {
        s = aSocket;
        salon = aSalon;
    }

    public void run() {
        try {
            try {
                in = new Scanner(s.getInputStream());
                out = new PrintWriter(s.getOutputStream());
                doService();
            } finally {
                s.close();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void doService() throws IOException {
        while (true) {
            if (!in.hasNext()) { return; }
            String command = in.next();
            if (command.equals("QUIT")) { return; }
            else { executeCommand(command); }
        }
    }

    public void executeCommand(String command) {
        int slotNumber = in.nextInt();
        if (command.equals("BOOK")) {
            salon.bookAppointment(slotNumber);
            out.println("Appointment booked for slot " + slotNumber);
        } else if (command.equals("CANCEL")) {
            salon.cancelAppointment(slotNumber);
            out.println("Appointment canceled for slot " + slotNumber);
        } else if (command.equals("CHECK")) {
            if (salon.isAvailable(slotNumber)) {
                out.println("Slot " + slotNumber + " is available");
            } else {
                out.println("Slot " + slotNumber + " is not available");
            }
        } else {
            out.println("Invalid command");
        }
        out.flush();
    }
}
