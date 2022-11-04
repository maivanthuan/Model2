package Case_study.Model;

public class Customer extends Person{
    private String type;
    private String address;

    public Customer() {
    }

    public Customer(String id, String name, String dateOfBirth, String gender, String CMND, String phoneNumber, String email, String type, String address) {
        super(id, name, dateOfBirth, gender, CMND, phoneNumber, email);
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}