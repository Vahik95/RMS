import java.sql.Timestamp;

public class Entry {

    private String name;
    private String supplier;
    private Timestamp expireDate;
    private int quantity;


    public Entry(String name, String supplier, Timestamp expireDate,int quantity) {
        this.name = name;
        this.supplier = supplier;
        this.quantity = quantity;
        this.expireDate = expireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Timestamp getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Timestamp expireDate) {
        this.expireDate = expireDate;
    }
}
