
public class ItemDecorator extends MenuItem {

    public MenuItem item;

    ItemDecorator(MenuItem menuItem) {
        this.item = menuItem;
    }

    ItemDecorator(MenuItem menuItem, float price) {
        super(menuItem.getDish(),price);
        this.item = menuItem;
    }

    public float getPrice() {
        return getPrice() + this.item.getPrice();
    }

    public void drawItem() {
        // TODO implement here
    }

}