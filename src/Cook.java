public class Cook extends Staff {

    private int cookRating;

    public Cook(String name, int id) {
        super(name, id);
    }

    public int getCookRating() {
        return cookRating;
    }

    public void setCookRating(int cookRating) {
        this.cookRating = cookRating;
    }
}