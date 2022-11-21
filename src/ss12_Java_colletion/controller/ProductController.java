package ss12_Java_colletion.controller;

import Case_study.Controller.BookingManager;
import ss12_Java_colletion.service.IProductService;
import ss12_Java_colletion.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IProductService iProductService = new ProductService();
        Sort sort = new Sort();
        do {
            System.out.println("---------ỨNG DỤNG QUẢN LÝ ĐIỆN THOẠI---------");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Sửa thông tin");
            System.out.println("3.Xóa sản phẩm");
            System.out.println("4.Hiển thị sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm");
            System.out.println("6.Sắp xếp sản phẩm");
            System.out.println("7.Thoát ứng dụng");
            System.out.println("Nhập số để chọn tiện ích");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    System.out.println("Nhập mã sản phẩm muốn thay đổi: ");
                    String id=scanner.nextLine();
                    iProductService.change(id);
                    break;
                case 3:
                    System.out.println("Nhập mã sản phẩm muốn xóa: ");
//                    String code = scanner.nextLine();
                    iProductService.removeProduct();
                    iProductService.display();
                    System.out.println("Xóa thành công");
                    break;
                case 4:
                    iProductService.display();
                    break;
                case 5:
                    System.out.println("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    iProductService.search(name);
                    break;
                case 6:
                    sort.Sort();
                    break;
                case 7:
                    System.exit(0);
            }
        }while (true);
    }
}
