package Pass.model;

import java.util.Scanner;

public class SavingBank extends Bank{
    private String money;
    private String sentDate;
    private String interest;
    private String tenor;
    public SavingBank(){}

    public SavingBank(String id, String code, String name, String date, String money, String sentDate, String interest, String tenor) {
        super(id, code, name, date);
        this.money = money;
        this.sentDate = sentDate;
        this.interest = interest;
        this.tenor = tenor;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getSentDate() {
        return sentDate;
    }

    public void setSentDate(String sentDate) {
        this.sentDate = sentDate;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getTenor() {
        return tenor;
    }

    public void setTenor(String tenor) {
        this.tenor = tenor;
    }

    @Override
    public String toString() {
        return "SavingBank{" +
                " id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", money='" + money + '\'' +
                ", sentDate='" + sentDate + '\'' +
                ", interest='" + interest + '\'' +
                ", tenor='" + tenor + '\'' +
                '}';
    }

    @Override
    public void infor() {
        Scanner scanner=new Scanner(System.in);
        inforBank();
        System.out.println("Nhập số tiền gửi tiết kiệm: ");
        this.money=scanner.nextLine();
        System.out.println("Nhập ngày gửi: ");
        this.sentDate=scanner.nextLine();
        System.out.println("Nhập lãi xuất: ");
        this.interest=scanner.nextLine();
        System.out.println("Nhập kì hạn: ");
        this.tenor=scanner.nextLine();
    }
}
