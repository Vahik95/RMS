import java.util.ArrayList;

public class WaiterCatalogue {

    private ArrayList<Waiter> waiters;

    public WaiterCatalogue() {
        this.waiters = new ArrayList<>();
    }

    public ArrayList<Waiter> getWaiters() {
        return waiters;
    }

    public void setWaiters(ArrayList<Waiter> waiters) {
        this.waiters = waiters;
    }

    public void addWaiter(Waiter waiter){
        this.waiters.add(waiter);
    }
}