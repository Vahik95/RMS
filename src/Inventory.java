import java.sql.Timestamp;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class Inventory {

    private Calendar calendar = Calendar.getInstance();
    private ArrayList<Entry> ingredients;

    public Inventory() {
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(String name, String supplier, Timestamp expireDate, int quantity) {
        for (Entry entry : ingredients) {
            if (entry.getName().equals(name) &&
                    entry.getSupplier().equals(supplier) &&
                    entry.getExpireDate().compareTo(expireDate) == 0) {
                entry.setQuantity(entry.getQuantity() + quantity);
            } else {
                this.ingredients.add(new Entry(name,supplier,expireDate,quantity));
            }
        }
    }

    public void remove() {
        Date now = calendar.getTime();
        Timestamp currentDateTime = new java.sql.Timestamp(now.getTime());
        for (Entry entry: ingredients) {
            if (entry.getExpireDate().compareTo(currentDateTime) <= 0)
                this.ingredients.remove(entry);
        }
    }

    public boolean checkIngredient(String name, int quantity) {
        for (Entry entry: ingredients) {
            if (entry.getName().equals(name) && entry.getQuantity() >= quantity)
                return true;
        }
        return false;
    }

    public Entry getIngredient(String name, int quantity) {
        Date now = calendar.getTime();
        Timestamp min = new java.sql.Timestamp(now.getTime());
        for (Entry entry: ingredients) {
            if (entry.getName().equals(name) && entry.getQuantity() >= quantity) {
                if (entry.getExpireDate().compareTo(min) < 0)
                    min = entry.getExpireDate();
            }
        }
        for (Entry entry: ingredients) {
            if (entry.getName().equals(name) && entry.getQuantity() >= quantity && entry.getExpireDate().compareTo(min) == 0) {
                entry.setQuantity(entry.getQuantity() - quantity);
                return entry;
            }
        }
        return null;
    }

}