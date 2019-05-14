import java.util.ArrayList;

public class DishCatalog {

    private ArrayList<Dish> dishes;

    public DishCatalog() {
        this.dishes = new ArrayList<>();
    }

    public ArrayList<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(ArrayList<Dish> dishes) {
        this.dishes = dishes;
    }

    public void addDish(Dish dish){
        this.dishes.add(dish);
    }

    public void removeDish(Dish dish){
        this.dishes.remove(dish);
    }

}