package ss16_IO_file.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public List<Integer> readFile(String filePath){
        List<Integer> number=new ArrayList<>();
        try {
            File file=new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line="";
            while ((line=br.readLine())!=null){
                number.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Có lỗi");
        }
        return number;
    }
    public void WriteFile(String filePath, int max){
        try {
            FileWriter writer=new FileWriter(filePath, true);
            BufferedWriter br= new BufferedWriter(writer);
            br.write("Giá trị lớn nhất là: "+ max);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
