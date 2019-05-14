public class GlobalController {

    private Archive archive;
    private RestaurantCatalog restaurantCatalog;
    private RatingCalculator ratingCalculator;

    public GlobalController(Archive archive, RestaurantCatalog restaurantCatalog, RatingCalculator ratingCalculator) {
        this.archive = archive;
        this.restaurantCatalog = restaurantCatalog;
        this.ratingCalculator = ratingCalculator;
    }


    public Archive getArchive() {
        return archive;
    }

    public void setArchive(Archive archive) {
        this.archive = archive;
    }

    public RestaurantCatalog getRestaurantCatalog() {
        return restaurantCatalog;
    }

    public void setRestaurantCatalog(RestaurantCatalog restaurantCatalog) {
        this.restaurantCatalog = restaurantCatalog;
    }

    public RatingCalculator getRatingCalculator() {
        return ratingCalculator;
    }

    public void setRatingCalculator(RatingCalculator ratingCalculator) {
        this.ratingCalculator = ratingCalculator;
    }
}