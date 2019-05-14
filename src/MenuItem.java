public abstract class MenuItem {

    private Dish dish;
    private float price;

    public MenuItem() {
    }

    public MenuItem(Dish dish, float price) {
        this.dish = dish;
        this.price = price;

    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void drawItem() {

    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }
}