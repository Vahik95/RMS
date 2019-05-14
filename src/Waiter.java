public class Waiter extends Staff {

    private int waiterRating;
    private Integer [] servedTables;

    public Waiter(String name, int id, int tableAmount) {
        super(name, id);
        this.servedTables = new Integer[tableAmount];
    }

    public void addServedTable(int tableID){
        for (int i = 0; i < servedTables.length; i++){
            if (servedTables[i]==null){
                servedTables[i] = tableID;
                System.out.println("Table is added to a Waiter serving list");
            }
        }
    }

    public void removeServedTable(int tableID){
        for (int i = 0; i < servedTables.length; i++){
            if (servedTables[i]==tableID){
                servedTables[i] = null;
                System.out.println("Table is removed to a Waiter serving list");
            }
        }
    }

    public int getWaiterRating() {
        return waiterRating;
    }

    public void setWaiterRating(int waiterRating) {
        this.waiterRating = waiterRating;
    }

    public Integer[] getServedTables() {
        return servedTables;
    }

    public void setServedTables(Integer[] servedTables) {
        this.servedTables = servedTables;
    }
}