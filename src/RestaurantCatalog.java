import java.util.ArrayList;

public class RestaurantCatalog {
    private ArrayList<Restaurant> restaurants;
    private GlobalController globalController;

    public RestaurantCatalog(GlobalController globalController) {
        this.restaurants = new ArrayList<>();
        this.globalController = globalController;
    }

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public void addRestaurant(Restaurant restaurant){
        this.restaurants.add(restaurant);
    }

    public GlobalController getGlobalController() {
        return globalController;
    }

    public void setGlobalController(GlobalController globalController) {
        this.globalController = globalController;
    }
}