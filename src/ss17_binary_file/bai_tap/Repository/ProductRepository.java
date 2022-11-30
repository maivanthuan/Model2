package ss17_binary_file.bai_tap.Repository;

import ss17_binary_file.bai_tap.Model.Product;
import ss17_binary_file.bai_tap.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private static final String FILE_PATh = "src/ss17_binary_file/bai_tap/data.dat";
    ReadAndWrite readAndWrite = new ReadAndWrite();
    List<Product> productList = readAndWrite.readFile(FILE_PATh);

    public void addProduct(Product product) {
        productList.add(product);
        readAndWrite.writeFile(productList, FILE_PATh);
    }
    public void display(){
        for (Product product:productList){
            System.out.println(product);
        }
    }
    public void search(String name){
        List<Product>productList=getAll();
        for (Product product:productList){
            if (product.getName().contains(name)){
                System.out.println(product);
            }
        }
        }
        public List<Product>getAll(){
        return productList;
        }
    }

