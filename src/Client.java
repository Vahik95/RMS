import java.util.Scanner;

public class Client {

    private String name;
    private int id;
    private Seat seat;

    public Client(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public int calculateRating(){
        return 25;
    }

    Order makeOrder(Restaurant restaurant, Menu menu){
        OrderBuilder orderBuilder = new OrderBuilder(menu,this, restaurant);
        Scanner input = new Scanner(System.in);
        while (input.next().equals("finish")){
            orderBuilder.addMenuItem(input.next());
        }
        return orderBuilder.buildOrder();
    }
}