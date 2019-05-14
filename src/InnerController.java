public class InnerController {

    private Inventory inventory;
    private ClientCatalogue clientCatalogue;
    private WaiterCatalogue waiterCatalogue;
    private OrderCatalogue orderCatalogue;
    private DishCatalog dishCatalog;
    private Restaurant restaurant;
    private Menu menu;
    private Cook cook;

    public InnerController(Restaurant restaurant, Inventory inventory, Menu menu, ClientCatalogue clientCatalogue,
                           WaiterCatalogue waiterCatalogue, OrderCatalogue orderCatalogue, DishCatalog dishCatalog, Cook cook) {
        this.restaurant = restaurant;
        this.inventory = inventory;
        this.menu = menu;
        this.clientCatalogue = clientCatalogue;
        this.waiterCatalogue = waiterCatalogue;
        this.orderCatalogue = orderCatalogue;
        this.dishCatalog = dishCatalog;
        this.cook = cook;
    }

    private void removeExpired() {
        inventory.remove();
    }

    private void addDish(Dish d) {
        dishCatalog.addDish(d);
    }

    private void removeDish(Dish d) {
        dishCatalog.removeDish(d);
    }

    public void makeOrder(int clientID){
        Order order = null;
        for (Client client: clientCatalogue.getClients()){
            if (client.getId() == clientID){
                order = client.makeOrder(restaurant,menu);
            }
        }

        order.setCook(cook);
        for (Waiter waiter: waiterCatalogue.getWaiters()){
            for (Integer tableID: waiter.getServedTables()){
                if (order.getSeat().getTable().getNumber() == tableID){
                    order.setWaiter(waiter);
                }
            }
        }

        orderCatalogue.addOrder(order);

    }
    //TODO: Since inventory.getIngredient returns Entries, we can pass those Entries to Cook, for seeing the recipe
    public void prepareOrder(){
        Order order = orderCatalogue.getFirstPendingOrder();
        order.setState("InProgress");
        for (MenuItem menuItem: order.getMenuItems()){
            for (Entry entry: menuItem.getDish().getRecipe()){
                inventory.getIngredient(entry.getName(),entry.getQuantity());
            }
        }
    }

    public void deliverOrder(){
        Order order = orderCatalogue.getFirstOrderInProgress();
        order.setState("Ready");
    }

    public String calculateClientRating(Integer clientID){
        for (ArchiveRecord archiveRecord: restaurant.getGlobalController().getArchive().getArchiveRecords()){
            restaurant.getGlobalController().getRatingCalculator().setOrder(
                    new Order(archiveRecord.getTimestamp(),archiveRecord.getPaidAmount()));
            archiveRecord.accept(restaurant.getGlobalController().getRatingCalculator());
            restaurant.getGlobalController().getRatingCalculator().setTotalAmount(
                    restaurant.getGlobalController().getRatingCalculator().getTotalAmount() +
                            restaurant.getGlobalController().getRatingCalculator().visit(
                                    restaurant.getGlobalController().getRatingCalculator().getOrder()));

        }
        return restaurant.getGlobalController().getRatingCalculator().calculateRating();
    }

    private void finishOrder(Integer clientID){
        Order finishingOrder = null;
        for (Order order: orderCatalogue.getOrders()){
            if (order.getClient().getId() == clientID)
                finishingOrder = order;
        }
        restaurant.getGlobalController().getArchive().addArchiveRecord(finishingOrder);
        orderCatalogue.getOrders().remove(finishingOrder);
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public ClientCatalogue getClientCatalogue() {
        return clientCatalogue;
    }

    public void setClientCatalogue(ClientCatalogue clientCatalogue) {
        this.clientCatalogue = clientCatalogue;
    }

    public WaiterCatalogue getWaiterCatalogue() {
        return waiterCatalogue;
    }

    public void setWaiterCatalogue(WaiterCatalogue waiterCatalogue) {
        this.waiterCatalogue = waiterCatalogue;
    }

    public OrderCatalogue getOrderCatalogue() {
        return orderCatalogue;
    }

    public void setOrderCatalogue(OrderCatalogue orderCatalogue) {
        this.orderCatalogue = orderCatalogue;
    }

    public DishCatalog getDishCatalog() {
        return dishCatalog;
    }

    public void setDishCatalog(DishCatalog dishCatalog) {
        this.dishCatalog = dishCatalog;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Cook getCook() {
        return cook;
    }

    public void setCook(Cook cook) {
        this.cook = cook;
    }
}