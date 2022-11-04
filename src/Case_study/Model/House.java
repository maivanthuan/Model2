package Case_study.Model;

public class House extends Facility{
    private String standard;
    private int floor;

    public House() {
    }

    public House(String name, String usable, double price, int amount, String type, String standard, int floor) {
        super(name, usable, price, amount, type);
        this.standard = standard;
        this.floor = floor;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "standard='" + standard + '\'' +
                ", floor=" + floor +
                '}';
    }
}
