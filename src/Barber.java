class Barber {
    private int barberId;
    private AppointmentManager appointmentManager;

    public Barber(int barberId) {
        this.barberId = barberId;
        this.appointmentManager = new AppointmentManager();
    }

    public boolean isAvailable(String time) {
        return appointmentManager.isAvailable(time);
    }

    public void bookAppointment(String time) {
        if (isAvailable(time)) {
            appointmentManager.bookAppointment(time);
        } else {
            System.out.println("Sorry, this schedule is not available");
        }
    }

    public void cancelAppointment(String time) {
        appointmentManager.cancelAppointment(time);
    }

    public int getBarberId() {
        return barberId;
    }
}