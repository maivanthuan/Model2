package Case_study.Model;

public class Contract {
    private int number;
    private String id;
    private double deposit;
    private double totalPay;
    private String idOfCustomer;

    public Contract() {
    }

    public Contract(int number, String id, double deposit, double totalPay, String idOfCustomer) {
        this.number = number;
        this.id = id;
        this.deposit = deposit;
        this.totalPay = totalPay;
        this.idOfCustomer = idOfCustomer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    public String getIdOfCustomer() {
        return idOfCustomer;
    }

    public void setIdOfCustomer(String idOfCustomer) {
        this.idOfCustomer = idOfCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "number=" + number +
                ", id='" + id + '\'' +
                ", deposit=" + deposit +
                ", totalPay=" + totalPay +
                ", idOfCustomer='" + idOfCustomer + '\'' +
                '}';
    }
}
