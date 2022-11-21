package ss12_Java_colletion.controller;

import ss12_Java_colletion.service.IProductService;
import ss12_Java_colletion.service.ProductService;

import java.util.Scanner;

public class Sort {
    IProductService iProductService=new ProductService();
    public void Sort(){
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.Tăng dần");
            System.out.println("2.Giảm dần");
            System.out.println("3.Quay lại");
            System.out.println("Mời chọn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    iProductService.sortt();
                    break;
                case 2:
                    iProductService.sortg();
                    break;
                case 3:
                    return;
            }
        }while (true);
    }
}
