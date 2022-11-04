package Case_study.Model;

public class Villa extends Facility{
    private String standard;
    private String pool;
    private int floor;

    public Villa() {
    }

    public Villa(String name, String usable, double price, int amount, String type, String standard, String pool, int floor) {
        super(name, usable, price, amount, type);
        this.standard = standard;
        this.pool = pool;
        this.floor = floor;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standard='" + standard + '\'' +
                ", pool='" + pool + '\'' +
                ", floor=" + floor +
                '}';
    }
}
