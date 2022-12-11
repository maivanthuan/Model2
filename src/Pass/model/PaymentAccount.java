package Pass.model;

import java.util.Scanner;

public class PaymentAccount extends Bank{
    private String cardNumber;
    private String moneyInCard;
    public PaymentAccount(){}

    public PaymentAccount(String id, String code, String name, String date, String cardNumber, String moneyInCard) {
        super(id, code, name, date);
        this.cardNumber = cardNumber;
        this.moneyInCard = moneyInCard;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getMoneyInCard() {
        return moneyInCard;
    }

    public void setMoneyInCard(String moneyInCard) {
        this.moneyInCard = moneyInCard;
    }

    @Override
    public String toString() {
        return "PaymentAccount{" +
                " id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", moneyInCard='" + moneyInCard + '\'' +
                '}';
    }

    @Override
    public void infor() {
        Scanner scanner=new Scanner(System.in);
        inforBank();
        System.out.println("Nhập số thẻ: ");
        this.cardNumber=scanner.nextLine();
        System.out.println("Nhập số tiền trong thẻ: ");
        this.moneyInCard=scanner.nextLine();
    }

}
