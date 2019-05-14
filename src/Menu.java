import java.util.HashMap;

public class Menu {

    private HashMap<String, MenuItem> menuItems;

    public Menu() {
        menuItems = new HashMap<>();
    }

    public void viewMainDishes(boolean isHot) {
        // TODO implement here
    }

    public void viewSalads() {
        // TODO implement here
    }

    public void viewDrinks(String type, boolean isHot, boolean isAlco) {
        // TODO implement here
    }

    public void viewDessert() {
        // TODO implement here
    }

    public HashMap<String, MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(HashMap<String, MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void addMenuItem(String name,MenuItem item){
        menuItems.put(name, item);
    }
}