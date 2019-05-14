public class Restaurant {

    private int restaurantID;
    private String restaurantName;
    private Location location;
    private GlobalController globalController;


    public Restaurant(int restaurantID, String restaurantName, Location location, GlobalController globalController) {
        this.restaurantID = restaurantID;
        this.restaurantName = restaurantName;
        this.location = location;
        this.globalController = globalController;
    }

    public int getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(int restaurantID) {
        this.restaurantID = restaurantID;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public GlobalController getGlobalController() {
        return globalController;
    }

    public void setGlobalController(GlobalController globalController) {
        this.globalController = globalController;
    }
}