package Case_study.Controller;

import Case_study.Service.ICustomerService;
import Case_study.Service.impl.CustomerService;

import java.util.Scanner;

public class CustomerManager {
    private final Scanner scanner = new Scanner(System.in);
    ICustomerService iCustomerService=new CustomerService();
    public void cusmenu() {
        do {
            System.out.println("----Customer Manager----");
            System.out.println("1.Display list customer");
            System.out.println("2.Add new customer");
            System.out.println("3.Edit customer");
            System.out.println("4.Return main menu");
            System.out.println("Mời chọn: ");
            int choice= Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                   iCustomerService.display();
                    break;
                case 2:
                    iCustomerService.add();
                    System.out.println("Thêm thành công");
                    break;
                case 3:
                    System.out.println("Nhập mã sản phẩm muốn sửa: ");
                    String id =scanner.nextLine();
                    iCustomerService.edit(id);
                    break;
                case 4:
                    return;
            }
        }while (true);
    }
}
