package ss16_IO_file.bai_tap.copy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Copy {
     public static List<String> readFile(String filePath){
        List<String>list=new ArrayList<>();
        try {
            File file=new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line="";
            while ((line= br.readLine())!=null){
                list.add(line);
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Có lỗi");
        }
        return list;
    }
    public static void writeFile(String filePath, List<String> data ) throws IOException {
        FileWriter writer=new FileWriter(filePath);
        BufferedWriter br= new BufferedWriter(writer);
        for (String in:data){
            br.write(in);
            br.write("\n");
        }
        br.close();
    }

    public static void main(String[] args) throws IOException {
        List<String> list=Copy.readFile("C:\\codegym\\Model2\\src\\ss16_IO_file\\bai_tap\\in.csv");
        writeFile("C:\\codegym\\Model2\\src\\ss16_IO_file\\bai_tap\\out.csv",list);
    }

}
