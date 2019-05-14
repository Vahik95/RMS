import java.util.ArrayList;

public class Drink extends Dish {

    private boolean isHot;
    private boolean isAlco;
    private String type;

    public Drink(boolean isHot, boolean isAlco, String type) {
        this.isHot = isHot;
        this.isAlco = isAlco;
        this.type = type;
    }

    public Drink(ArrayList<Entry> recipe, String name, boolean isVegan, boolean isHot, boolean isAlco, String type) {
        super(recipe, name, isVegan);
        this.isHot = isHot;
        this.isAlco = isAlco;
        this.type = type;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    public boolean isAlco() {
        return isAlco;
    }

    public void setAlco(boolean alco) {
        isAlco = alco;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}