import java.sql.Timestamp;

public class Ingredient {

    private String name;
    private double quantity;
    private double price;
    private String ingredientSupplier;
    private Timestamp expireDate;

    public Ingredient(String name, String ingredientSupplier, double quantity, Timestamp expireDate) {
        this.name = name;
        this.ingredientSupplier = ingredientSupplier;
        this.quantity = quantity;
        this.expireDate = expireDate;

    }

    public Ingredient(String name, double quantity, double price, String ingredientSupplier, Timestamp expireDate) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.ingredientSupplier = ingredientSupplier;
        this.expireDate = expireDate;
    }

    public void modify() {
        // TODO implement here
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIngredientSupplier() {
        return ingredientSupplier;
    }

    public void setIngredientSupplier(String ingredientSupplier) {
        this.ingredientSupplier = ingredientSupplier;
    }

    public Timestamp getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Timestamp expireDate) {
        this.expireDate = expireDate;
    }
}