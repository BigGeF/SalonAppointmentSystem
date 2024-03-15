import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AppointmentSlot {
    private boolean available;
    private Lock lock;

    public AppointmentSlot() {
        available = true;
        lock = new ReentrantLock();
    }

    public void book() {
        lock.lock();
        try {
            if (available) {
                available = false;
            }
        } finally {
            lock.unlock();
        }
    }

    public void cancel() {
        lock.lock();
        try {
            available = true;
        } finally {
            lock.unlock();
        }
    }

    public boolean isAvailable() {
        return available;
    }
}
