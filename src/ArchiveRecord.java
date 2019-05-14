import java.sql.Timestamp;

public class ArchiveRecord implements Record {

    private int paidAmount;
    private Timestamp timestamp;

    private int waiterID;
    private int waiterRating;

    private int cookID;
    private int cookRating;

    private int restaurantID;

    private int clientID;
    private  int clientRating;

    private Timestamp duration;
    private Report report;

    public ArchiveRecord(int paidAmount, Timestamp timestamp, int waiterID, int waiterRating,
                         int cookID, int cookRating, int restaurantID, int clientID, int clientRating, Timestamp duration) {
        this.paidAmount = paidAmount;
        this.timestamp = timestamp;
        this.waiterID = waiterID;
        this.waiterRating = waiterRating;
        this.cookID = cookID;
        this.cookRating = cookRating;
        this.restaurantID = restaurantID;
        this.clientID = clientID;
        this.clientRating = clientRating;
        this.duration = duration;
    }

    public int getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(int paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public int getWaiterID() {
        return waiterID;
    }

    public void setWaiterID(int waiterID) {
        this.waiterID = waiterID;
    }

    public int getWaiterRating() {
        return waiterRating;
    }

    public void setWaiterRating(int waiterRating) {
        this.waiterRating = waiterRating;
    }

    public int getCookID() {
        return cookID;
    }

    public void setCookID(int cookID) {
        this.cookID = cookID;
    }

    public int getCookRating() {
        return cookRating;
    }

    public void setCookRating(int cookRating) {
        this.cookRating = cookRating;
    }

    public int getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(int restaurantID) {
        this.restaurantID = restaurantID;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public Timestamp getDuration() {
        return duration;
    }

    public void setDuration(Timestamp duration) {
        this.duration = duration;
    }

    public int getClientRating() {
        return clientRating;
    }

    public void setClientRating(int clientRating) {
        this.clientRating = clientRating;
    }

    @Override
    public void accept(Report report) {
        this.report = report;
    }
}