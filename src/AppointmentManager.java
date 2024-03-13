import java.util.HashSet;

class AppointmentManager {
    private HashSet<String> appointments;

    public AppointmentManager() {
        this.appointments = new HashSet<>();
    }

    public boolean isAvailable(String time) {
        return !appointments.contains(time);
    }

    public void bookAppointment(String time) {
        appointments.add(time);
    }

    public void cancelAppointment(String time) {
        appointments.remove(time);
    }
}