package Pass.repository.impl;

import Pass.model.PaymentAccount;
import Pass.readandwrite.ReadAndWritPayment;
import Pass.repository.IPaymentRepository;

import java.util.List;

public class PaymentRepository implements IPaymentRepository {
    ReadAndWritPayment readAndWritPayment=new ReadAndWritPayment();
    List<PaymentAccount>paymentAccountList=readAndWritPayment.readFilePayment(FILE_PAYMENT);
    @Override
    public void addPayment(PaymentAccount paymentAccount) {
        paymentAccountList.add(paymentAccount);
        readAndWritPayment.writeFilePayment(FILE_PAYMENT,paymentAccountList);
    }

    @Override
    public void removePayment(PaymentAccount paymentAccount) {
        paymentAccountList.remove(paymentAccount);
        readAndWritPayment.writeFilePayment(FILE_PAYMENT,paymentAccountList);
    }

    @Override
    public List<PaymentAccount> getAll() {
        return paymentAccountList;
    }
}
