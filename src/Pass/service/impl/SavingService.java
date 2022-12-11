package Pass.service.impl;
import Pass.model.SavingBank;
import Pass.repository.ISavingRepository;
import Pass.repository.impl.SavingRepository;
import Pass.service.ISavingService;

import java.util.List;
import java.util.Scanner;

public class SavingService implements ISavingService {
    ISavingRepository iSavingRepository=new SavingRepository();
    Scanner scanner=new Scanner(System.in);
    List<SavingBank>savingBankList=iSavingRepository.getAll();
    @Override
    public void addSaving() {
        SavingBank savingBank=new SavingBank();
        savingBank.infor();
        iSavingRepository.addSaving(savingBank);
    }

    @Override
    public void removeSaving(String code) {
    SavingBank savingBankObj=null;
    for (SavingBank savingBank:savingBankList){
        if (savingBank.getCode().equals(code)){
            savingBankObj=savingBank;
            break;
        }
    }
    if (savingBankObj!=null){
        System.out.println("Bạn có muốn xóa không?");
        System.out.println("1.Yes");
        System.out.println("2.No");
        int choice=Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                iSavingRepository.removeSaving(savingBankObj);
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
    public void display() {
        for (SavingBank savingBank:savingBankList){
            System.out.println(savingBank);
        }
    }

    @Override
    public void searchSaving(String code) {
        SavingBank savingBankObj = null;
        for (SavingBank savingBank : savingBankList) {
            if (savingBank.getCode().equals(code)) {
                savingBankObj = savingBank;
                break;
            }
        }
        if (savingBankObj != null) {
            System.out.println("Tìm thành công: ");
            System.out.println(savingBankObj);
        }else {
            System.out.println("Không tìm thấy");
        }
    }
}
