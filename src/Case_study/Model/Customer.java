package Case_study.Model;

import java.util.Scanner;

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
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", CMND='" + CMND + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                "type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void inforCustomer(){
        Scanner scanner=new Scanner(System.in);
        inforPerson();
        System.out.println("Nhập loại khách hàng: ");
        this.type=scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        this.address=scanner.nextLine();
    }
}
