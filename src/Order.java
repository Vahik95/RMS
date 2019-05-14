import java.sql.Timestamp;
import java.util.ArrayList;

public class Order {

    private int paidAmount;
    private String state;

    private ArrayList<MenuItem> menuItems;
    private Seat seat;

    private Restaurant restaurant;
    private Client client;
    private Cook cook;
    private Waiter waiter;

    private Timestamp timestamp;

    public Order() {
    }

    public Order(Timestamp timestamp, int paidAmount) {
        this.paidAmount = paidAmount;
        this.timestamp = timestamp;
    }

    public Order(String state, ArrayList<MenuItem> menuItems, Seat seat,
                 Restaurant restaurant, Timestamp timestamp, Client client) {
        this.state = state;
        this.menuItems = menuItems;
        this.seat = seat;
        this.restaurant = restaurant;
        this.timestamp = timestamp;
        this.client = client;
    }

    public Order(int paidAmount, Restaurant restaurant, Cook cook, Waiter waiter, Timestamp timestamp) {
        this.paidAmount = paidAmount;
        this.restaurant = restaurant;
        this.cook = cook;
        this.waiter = waiter;
        this.timestamp = timestamp;
    }

    public Order(int paidAmount, String state, ArrayList<MenuItem> menuItems, Seat seat,
                 Restaurant restaurant, Cook cook, Waiter waiter, Timestamp timestamp) {
        this.paidAmount = paidAmount;
        this.state = state;
        this.menuItems = menuItems;
        this.seat = seat;
        this.restaurant = restaurant;
        this.cook = cook;
        this.waiter = waiter;
        this.timestamp = timestamp;
    }


    public float totalPrice() {
        float sum = 0;
        for(int i = 0; i < this.menuItems.size(); i++) {
            sum += this.menuItems.get(i).getPrice();
        }
        return sum;
    }

    public int calculateDiscount() {
        return 450;
    }

    public int getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(int paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Cook getCook() {
        return cook;
    }

    public void setCook(Cook cook) {
        this.cook = cook;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}