import java.util.HashSet;

class Barber {
    private int barberId;
    // here could be a external time management system
    private HashSet<String> appointments;

    public Barber(int barberId) {
        this.barberId = barberId;
        this.appointments = new HashSet<>();
    }

    public boolean isAvailable(String time) {
        return !appointments.contains(time);
    }

    public int getBarberId() {
        System.out.println("BarberID is   " + barberId);
        return barberId;
    }
    public void bookAppointment(String time) {
        if (isAvailable(time)) {
            appointments.add(time);
        } else {
            System.out.println("Sorry, this schedule is not available ");
        }
    }

    public void cancelAppointment(String time) {
        if (appointments.contains(time)) {
            appointments.remove(time);
        } else {
            System.out.println("No appointment for you to cancel at this schedule");
        }
    }
}