package Pass.readandwrite;

import Pass.model.SavingBank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteSaving {
    public List<SavingBank>readFileSaving(String filePath){
        List<SavingBank>savingBankList=new ArrayList<>();
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
                String money=temp[4];
                String sentDate=temp[5];
                String interest=temp[6];
                String tenor=temp[7];
                SavingBank savingBank=new SavingBank(id,code,name,date,money,sentDate,interest,tenor);
                savingBankList.add(savingBank);
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
        return savingBankList;
    }
    public void writeFileSaving(String filePath, List<SavingBank>savingBankList){
        FileWriter fileWriter;
        BufferedWriter brw = null;
        try {
            fileWriter =new FileWriter(filePath);
            brw=new BufferedWriter(fileWriter);
            StringBuilder str=new StringBuilder();
            for (SavingBank savingBank:savingBankList){
                str.append(savingBank.getId()).append(",").append(savingBank.getCode()).append(",").append(savingBank.getName()).append(",").append(savingBank.getDate()).append(",").append(savingBank.getMoney()).append(",").
                        append(savingBank.getSentDate()).append(",").append(savingBank.getInterest()).append(",").append(savingBank.getTenor()).append("\n");
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
