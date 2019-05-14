public class MonthlyReport implements Report {

    public MonthlyReport() {
    }


    @Override
    public int visit(Order order) {
        return 0;
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
}