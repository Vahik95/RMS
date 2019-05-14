public interface Report {

    public int visit(Order order);

    public void visit(Cook cook);

    public void visit(Waiter waiter);

    public void visit(Client client);

    public void visit(Restaurant restaurant);

}