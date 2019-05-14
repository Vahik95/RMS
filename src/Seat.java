public class Seat {

    private Table table;
    private int seatNumber;

    public Seat(int seatNumber, Table table) {
        this.table = table;
        this.seatNumber = seatNumber;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}