import java.util.ArrayList;
import java.util.Calendar;

public class OrderBuilder implements Builder {

    private Menu menu;
    private Restaurant restaurant;
    private ArrayList<MenuItem> menuItems;
    private Client client;

    OrderBuilder(Menu menu, Client client, Restaurant restaurant) {
        this.restaurant = restaurant;
        this.menu = menu;
        this.client = client;
        this.menuItems = new ArrayList<>();
    }

    @Override
    public void addMenuItem(String name) {
        menuItems.add(menu.getMenuItems().get(name));
    }

    @Override
    public void removeMenuItem(String name) {
        menuItems.remove(menu.getMenuItems().get(name));
    }

    @Override
    public Order buildOrder() {
        Calendar calendar = Calendar.getInstance();
        java.util.Date now = calendar.getTime();
        java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());
        return new Order("Pending",menuItems,client.getSeat(),restaurant, currentTimestamp,client);
    }

}