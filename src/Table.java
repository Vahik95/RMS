import java.util.ArrayList;

public class Table {

    private int number;
    private ArrayList<Seat> seats;

    public Table(int number) {
        this.number = number;
        seats = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }
}