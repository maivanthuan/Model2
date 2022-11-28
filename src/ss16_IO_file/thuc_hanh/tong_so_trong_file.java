package ss16_IO_file.thuc_hanh;

import java.io.*;
import java.util.Scanner;

public class tong_so_trong_file {
    public void readFile(String filePath) throws IOException {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int num = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                num += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng: "+ num);
        }catch (Exception e){
            System.out.println("Có lỗi");
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Nhập đường file dẫn: ");
        Scanner scanner=new Scanner(System.in);
        String path=scanner.nextLine();
        tong_so_trong_file tong_so_trong_file=new tong_so_trong_file();
        tong_so_trong_file.readFile(path);
    }
}
