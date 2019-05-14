import java.util.ArrayList;

public abstract class Dish {

    protected ArrayList<Entry> recipe;
    protected String name;
    protected boolean isAvailable;
    protected boolean isVegan;

    public Dish() {
    }

    public Dish(ArrayList<Entry> recipe, String name, boolean isVegan) {
        this.recipe = recipe;
        this.name = name;
        this.isVegan = isVegan;
    }

    public ArrayList<Entry> getRecipe() {
        return recipe;
    }

    public void setRecipe(ArrayList<Entry> recipe) {
        this.recipe = recipe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public boolean checkAvailability() {
        return true;
    }

}