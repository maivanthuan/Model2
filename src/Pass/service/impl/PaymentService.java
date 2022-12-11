package Pass.service.impl;

import Pass.model.PaymentAccount;
import Pass.model.SavingBank;
import Pass.readandwrite.ReadAndWritPayment;
import Pass.repository.IPaymentRepository;
import Pass.repository.ISavingRepository;
import Pass.repository.impl.PaymentRepository;
import Pass.service.IPaymentService;
import Pass.until.NotFoundBankAccountException;

import java.util.List;
import java.util.Scanner;

public class PaymentService implements IPaymentService {
    IPaymentRepository iPaymentRepository=new PaymentRepository();
    Scanner scanner=new Scanner(System.in);
    List<PaymentAccount>paymentAccountList=iPaymentRepository.getAll();
    @Override
    public void addPayment() {
        PaymentAccount paymentAccount=new PaymentAccount();
        paymentAccount.infor();
        iPaymentRepository.addPayment(paymentAccount);
    }

    @Override
    public void display() {
    for (PaymentAccount paymentAccount:paymentAccountList){
        System.out.println(paymentAccount);
    }
    }

    @Override
    public void removePayment(String code) {
        PaymentAccount paymentAccountObi=null;
        for (PaymentAccount paymentAccount:paymentAccountList){
            if (paymentAccount.getCode().equals(code)){
                paymentAccountObi=paymentAccount;
                break;
            }
        }
        if (paymentAccountObi!=null){
            System.out.println("Bạn có muốn xóa không?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iPaymentRepository.removePayment(paymentAccountObi);
                    System.out.println("Xóa thành công");
                    break;
                case 2:
                    return;
            }

        }else {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void searchPaymant(String code) {
        PaymentAccount paymentAccountObj = null;
        for (PaymentAccount paymentAccount : paymentAccountList) {
            if (paymentAccount.getCode().equals(code)) {
                paymentAccountObj = paymentAccount;
                break;
            }
        }
        if (paymentAccountObj != null) {
            System.out.println("Tìm thành công: ");
            System.out.println(paymentAccountObj);
        }else {
            System.out.println("Không tìm thấy");
        }
    }
}
