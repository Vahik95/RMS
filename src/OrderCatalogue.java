import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class OrderCatalogue {

    private ArrayList<Order> orders;

    public OrderCatalogue() {
        this.orders = new ArrayList<>();
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    void addOrder(Order order) {
        if (order != null)
            this.orders.add(order);
    }

    Order getFirstPendingOrder(){
        Order firstPending = null;
        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();
        Timestamp current = new java.sql.Timestamp(now.getTime());
        for (Order order: orders){
            if (order.getState().equals("Pending") && order.getTimestamp().compareTo(current)<0)
                current = order.getTimestamp();
        }
        for (Order order: orders){
            if (order.getState().equals("Pending")  && order.getTimestamp().compareTo(current) == 0)
                firstPending = order;

        }
        return firstPending;
    }

    Order getFirstOrderInProgress(){
        Order firstOrderInProgress = null;
        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();
        Timestamp current = new java.sql.Timestamp(now.getTime());
        for (Order order: orders){
            if (order.getState().equals("InProgress") && order.getTimestamp().compareTo(current)<0)
                current = order.getTimestamp();
        }
        for (Order order: orders){
            if (order.getState().equals("InProgress")  && order.getTimestamp().compareTo(current) == 0)
                firstOrderInProgress  = order;

        }
        return firstOrderInProgress ;
    }
}