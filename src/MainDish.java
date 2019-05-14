import java.util.ArrayList;

public class MainDish extends Dish {

    private boolean isHot;

    public MainDish(boolean isHot) {
        this.isHot = isHot;
    }

    public MainDish(ArrayList<Entry> recipe, String name, boolean isVegan, boolean isHot) {
        super(recipe, name, isVegan);
        this.isHot = isHot;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }
}