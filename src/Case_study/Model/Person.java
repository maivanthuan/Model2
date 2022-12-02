package Case_study.Model;

import java.util.Scanner;

public abstract class Person {
    protected String id;
    protected String name;
    protected String dateOfBirth;
    protected String gender;
    protected String CMND;
    protected String phoneNumber;
    protected String email;

    public Person() {
    }

    public Person(String id, String name, String dateOfBirth, String gender, String CMND, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.CMND = CMND;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", CMND='" + CMND + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public void inforPerson(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập mã: ");
        this.id=scanner.nextLine();
        System.out.println("Nhập tên: ");
        this.name=scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        this.dateOfBirth=scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        this.dateOfBirth=scanner.nextLine();
        System.out.println("Nhập số CMND: ");
        this.CMND=scanner.nextLine();
        System.out.println("Nhập số điện thoại: ");
        this.phoneNumber=scanner.nextLine();
        System.out.println("Nhập email: ");
        this.email=scanner.nextLine();
    }
}
