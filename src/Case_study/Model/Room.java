package Case_study.Model;

public class Room extends Facility{
    private String serviceOther;

    public Room() {
    }

    public Room(String name, String usable, double price, int amount, String type, String serviceOther) {
        super(name, usable, price, amount, type);
        this.serviceOther = serviceOther;
    }

    public String getServiceOther() {
        return serviceOther;
    }

    public void setServiceOther(String serviceOther) {
        this.serviceOther = serviceOther;
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceOther='" + serviceOther + '\'' +
                '}';
    }
}
