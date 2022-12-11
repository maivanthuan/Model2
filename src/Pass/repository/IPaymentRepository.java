package Pass.repository;

import Pass.model.PaymentAccount;

import java.util.List;

public interface IPaymentRepository {
    String FILE_PAYMENT="src/Pass/data/Payment.csv";
    void addPayment(PaymentAccount paymentAccount);
    void removePayment(PaymentAccount paymentAccount);
    List<PaymentAccount>getAll();
}
