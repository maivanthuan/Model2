package ss17_binary_file.bai_tap;

import ss17_binary_file.bai_tap.Model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
        List<Product>productList=new ArrayList<>();
        public void writeFile(List<Product>productList,String path){
            try {
                FileOutputStream fos=new FileOutputStream(path);
                ObjectOutputStream oos=new ObjectOutputStream(fos);
                oos.writeObject(productList);
                oos.close();
            }catch (IOException e){
                e.printStackTrace();
                System.out.println("Lỗi file viết");
            }
        }
        public List<Product>readFile(String path){
            try {
                FileInputStream fis=new FileInputStream(path);
                ObjectInputStream ois=new ObjectInputStream(fis);
                productList=(List<Product>) ois.readObject();
            }catch (IOException |ClassNotFoundException e){
                e.printStackTrace();
                System.out.println("Lỗi file đọc");
            }
            return productList;
        }
}
