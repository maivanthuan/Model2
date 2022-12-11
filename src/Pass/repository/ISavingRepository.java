package Pass.repository;

import Pass.model.PaymentAccount;
import Pass.model.SavingBank;

import java.util.List;

public interface ISavingRepository {
        String FILE_SAVING="src/Pass/data/Saving.csv";
        void addSaving(SavingBank savingBank);
        void removeSaving(SavingBank savingBank);
        List<SavingBank>getAll();
}
