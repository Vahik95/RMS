import java.util.ArrayList;

public class CookCatalogue {

    private ArrayList<Cook> cooks;

    public CookCatalogue() {
        this.cooks = new ArrayList<>();
    }

    public ArrayList<Cook> getCooks() {
        return cooks;
    }

    public void setCooks(ArrayList<Cook> cooks) {
        this.cooks = cooks;
    }

    public void addCook(Cook cook){
        this.cooks.add(cook);
    }
}