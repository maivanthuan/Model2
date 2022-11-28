package ss16_IO_file.bai_tap.doc_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Doc {
    private static final String FILE_PATH="C:\\codegym\\Model2\\src\\ss16_IO_file\\bai_tap\\doc_file\\in.csv";
    public static List<Country> readList() throws IOException {
        List<Country>countryList=new ArrayList<>();
        FileReader fileReader=new FileReader(FILE_PATH);
        BufferedReader br=new BufferedReader(fileReader);
        String line="";
        String[] temp;
        Country country;
        while ((line=br.readLine())!=null){
            temp=line.split(",");
            int id=Integer.parseInt(temp[0]);
            String code=temp[1];
            String name=temp[2];
            country=new Country(id,code,name);
            countryList.add(country);
        }
        br.close();
        return countryList;
    }

    public static void main(String[] args) throws IOException {
      List<Country>countryList=Doc.readList();
      for (Country country:countryList){
          System.out.println(country);
      }

    }

}
