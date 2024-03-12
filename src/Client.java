import java.util.HashMap;

class Client {
    private int clientId;
    private HashMap<Integer, Barber> barbers;

    public Client(int clientId, HashMap<Integer, Barber> barbers) {
        this.clientId = clientId;
        this.barbers = barbers;
    }

    public void bookAppointment(int barberId, String time) {
        Barber barber = barbers.get(barberId);
        if (barber != null) {
            barber.bookAppointment(time);
        } else {
            System.out.println("Barber does not exist.");
        }
    }

    public void updateAppointment(int barberId, String oldTime, String newTime) {
        Barber barber = barbers.get(barberId);
        if (barber != null) {
            if (barber.isAvailable(newTime)) {
                barber.cancelAppointment(oldTime);
                barber.bookAppointment(newTime);
            } else {
                System.out.println("New time slot is not available.");
            }
        } else {
            System.out.println("Barber does not exist.");
        }
    }

    public void cancelAppointment(int barberId, String time) {
        Barber barber = barbers.get(barberId);
        if (barber != null) {
            barber.cancelAppointment(time);
        } else {
            System.out.println("Barber does not exist.");
        }
    }

    public void quit() {
        System.out.println("You logged out from system.");
        System.exit(0);
    }

    @Override
    public String toString()
    {
        return "Client{" +
                "barbers=" + barbers +
                '}';
    }
}
