package ss17_binary_file.bai_tap.Controller;

import ss17_binary_file.bai_tap.Service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ProductService productService=new ProductService();
        do {
            System.out.println("ỨNG DỤNG QUẢN LÝ SẢN PHẨM");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Hiển thị");
            System.out.println("3.Tìm kiếm sản phẩm");
            System.out.println("4.Thoát");
            System.out.println("Nhập số để chọn tác dụng: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productService.add();
                    System.out.println("Thêm thành công");
                    break;
                case 2:
                    productService.displayProduct();
                    break;
                case 3:
                    System.out.println("Nhập tên  sản phẩm cần tìm: ");
                    String name = scanner.nextLine();
                    productService.searchproduct(name);
                    break;
                case 4:
                    System.exit(0);
            }
        }while (true);
    }
}
