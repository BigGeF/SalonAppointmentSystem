public class Salon {
    private AppointmentSlot[] slots;

    public Salon(int size) {
        slots = new AppointmentSlot[size];
        for (int i = 0; i < slots.length; i++) {
            slots[i] = new AppointmentSlot();
        }
    }

    public void bookAppointment(int slotNumber) {
        AppointmentSlot slot = slots[slotNumber];
        slot.book();
    }

    public void cancelAppointment(int slotNumber) {
        AppointmentSlot slot = slots[slotNumber];
        slot.cancel();
    }

    public boolean isAvailable(int slotNumber) {
        AppointmentSlot slot = slots[slotNumber];
        return slot.isAvailable();
    }
}
