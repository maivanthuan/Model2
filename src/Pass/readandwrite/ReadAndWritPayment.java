package Pass.readandwrite;

import Pass.model.PaymentAccount;
import Pass.model.SavingBank;
import Pass.until.NotFoundBankAccountException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWritPayment {
    public List<PaymentAccount> readFilePayment(String filePath)   {
        List<PaymentAccount>paymentAccountList=new ArrayList<>();
        FileReader fileReader;
        BufferedReader br=null;
        try {
            fileReader=new FileReader(filePath);
            br =new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line= br.readLine())!=null){
                temp=line.split(",");
                String id=temp[0];
                String code=temp[1];
                String name=temp[2];
                String date=temp[3];
                String cardNumber=temp[4];
                String moneyInCard=temp[5];
                PaymentAccount paymentAccount=new PaymentAccount(id,code,name,date,cardNumber,moneyInCard);
                paymentAccountList.add(paymentAccount);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return paymentAccountList;
    }
    public void writeFilePayment(String filePath, List<PaymentAccount>paymentAccountList){
        FileWriter fileWriter;
        BufferedWriter brw = null;
        try {
            fileWriter =new FileWriter(filePath);
            brw=new BufferedWriter(fileWriter);
            StringBuilder str=new StringBuilder();
            for (PaymentAccount paymentAccount:paymentAccountList){
                str.append(paymentAccount.getId()).append(",").append(paymentAccount.getCode()).append(",").append(paymentAccount.getName()).append(",").append(paymentAccount.getDate()).append(",")
                        .append(paymentAccount.getCardNumber()).append(",").append(paymentAccount.getMoneyInCard()).append("\n");
            }
            if (str.length()>0){
                brw.write(str.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                brw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
