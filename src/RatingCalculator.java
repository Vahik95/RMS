public class RatingCalculator implements Report {

    private short goldThreshold;
    private short silverThreshold;
    private short bronzeThreshold;
    private double totalAmount;
    private Order order;

    public RatingCalculator(short goldThreshold, short silverThreshold, short bronzeThreshold) {
        this.goldThreshold = goldThreshold;
        this.silverThreshold = silverThreshold;
        this.bronzeThreshold = bronzeThreshold;
    }

    public String calculateRating() {
        if (totalAmount < bronzeThreshold)
            return  "None";
        else if (totalAmount < silverThreshold)
            return "Bronze";
        else if (totalAmount < goldThreshold)
            return "Silver";
        else
            return "Gold";

    }

    @Override
    public int visit(Order order) {
        return order.getPaidAmount();
    }

    @Override
    public void visit(Cook cook) {

    }

    @Override
    public void visit(Waiter waiter) {

    }

    @Override
    public void visit(Client client) {

    }

    @Override
    public void visit(Restaurant restaurant) {

    }


    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
