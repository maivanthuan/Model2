package ss17_binary_file.bai_tap.Service;

import ss17_binary_file.bai_tap.Model.Product;
import ss17_binary_file.bai_tap.Repository.ProductRepository;

import java.util.Scanner;

public class ProductService {
    Product product=new Product();
    ProductRepository productRepository=new ProductRepository();
    Scanner scanner=new Scanner(System.in);
    public void add(){
        System.out.println("Nhập mã sản phẩm: ");
        String id=scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name=scanner.nextLine();
        System.out.println("Nhập nhà sản xuất: ");
        String manufacturer=scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        String price=scanner.nextLine();
        productRepository.addProduct(new Product(id,name,manufacturer,price));
    }
    public void displayProduct(){
       productRepository.display();
    }
    public void searchproduct(String name){
        productRepository.search(name);
    }
}
