package Case_study.Model;

public abstract class  Facility {
    private String name;
    private String usable;
    private double price;
    private int amount;
    private String type;

    public Facility() {
    }

    public Facility(String name, String usable, double price, int amount, String type) {
        this.name = name;
        this.usable = usable;
        this.price = price;
        this.amount = amount;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsable() {
        return usable;
    }

    public void setUsable(String usable) {
        this.usable = usable;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "name='" + name + '\'' +
                ", usable='" + usable + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }
}
