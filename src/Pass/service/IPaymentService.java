package Pass.service;

public interface IPaymentService {
    void addPayment();
    void display();
    void removePayment(String code);
    void searchPaymant(String code);
}
