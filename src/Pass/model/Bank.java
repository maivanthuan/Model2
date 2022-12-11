package Pass.model;

import java.util.Objects;
import java.util.Scanner;

public abstract class Bank {
    protected String id;
    protected String code;
    protected String name;
    protected String date;
    public Bank(){}

    public Bank(String id, String code, String name, String date) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
    public abstract void infor();
    public void inforBank(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập id: ");
        this.id=scanner.nextLine();
        System.out.println("NHập mã: ");
        this.code=scanner.nextLine();
        System.out.println("Nhập tên: ");
        this.name=scanner.nextLine();
        System.out.println("Nhập ngày tạo tài khoản: ");
        this.date=scanner.nextLine();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(code, bank.code);
    }
}
