package Pass.repository.impl;

import Pass.model.PaymentAccount;
import Pass.model.SavingBank;
import Pass.readandwrite.ReadAndWriteSaving;
import Pass.repository.ISavingRepository;

import java.util.List;

public class SavingRepository implements ISavingRepository {
    ReadAndWriteSaving readAndWriteSaving=new ReadAndWriteSaving();
    List<SavingBank>savingBankList=readAndWriteSaving.readFileSaving(FILE_SAVING);
    @Override
    public void addSaving(SavingBank savingBank) {
        savingBankList.add(savingBank);
        readAndWriteSaving.writeFileSaving(FILE_SAVING,savingBankList);
    }

    @Override
    public void removeSaving(SavingBank savingBank) {
        savingBankList.remove(savingBank);
        readAndWriteSaving.writeFileSaving(FILE_SAVING,savingBankList);
    }

    @Override
    public List<SavingBank> getAll() {
        return savingBankList;
    }
}
