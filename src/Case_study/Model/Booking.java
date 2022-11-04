package Case_study.Model;

public class Booking {
    private String id;
    private int dayStart;
    private int endStart;
    private String idOfCustomer;
    private String nameService;
    private String type;

    public Booking() {
    }

    public Booking(String id, int dayStart, int endStart, String idOfCustomer, String nameService, String type) {
        this.id = id;
        this.dayStart = dayStart;
        this.endStart = endStart;
        this.idOfCustomer = idOfCustomer;
        this.nameService = nameService;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDayStart() {
        return dayStart;
    }

    public void setDayStart(int dayStart) {
        this.dayStart = dayStart;
    }

    public int getEndStart() {
        return endStart;
    }

    public void setEndStart(int endStart) {
        this.endStart = endStart;
    }

    public String getIdOfCustomer() {
        return idOfCustomer;
    }

    public void setIdOfCustomer(String idOfCustomer) {
        this.idOfCustomer = idOfCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id='" + id + '\'' +
                ", dayStart=" + dayStart +
                ", endStart=" + endStart +
                ", idOfCustomer='" + idOfCustomer + '\'' +
                ", nameService='" + nameService + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
