import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //  Initialize a barber
        Barber barber1 = new Barber(1);

        //  Initialize a hashmap to store barbers
        HashMap<Integer, Barber> barbers = new HashMap<>();
        barbers.put(barber1.getBarberId(), barber1);

        //  Initialize a client
        Client client1 = new Client(101, barbers);

        //  booking an appointment
        System.out.println("Booking an appointment at 10:00 AM:");
        client1.bookAppointment(1, "10:00 AM");
        client1.bookAppointment(1, "10:00 AM");
        //  Should show an error
        System.out.println("Trying to book again at the same time:");

        //  updating an appointment
        System.out.println("Updating the appointment to 11:00 AM:");
        client1.updateAppointment(1, "10:00 AM", "11:00 AM");
        System.out.println("Trying to update to a time that's already booked:");
        client1.bookAppointment(1, "11:00 AM");
        // Should show an error
        client1.updateAppointment(1, "11:00 AM", "11:00 AM");

        //  cancelling an appointment
        System.out.println("Cancelling the appointment at 11:00 AM:");
        client1.cancelAppointment(1, "11:00 AM");
        System.out.println("Trying to cancel again at the same time:");
        // Should show an error
        client1.cancelAppointment(1, "11:00 AM");

        // logout
        client1.quit();
    }
}
