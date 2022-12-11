package Pass.controller;

import Pass.service.ISavingService;
import Pass.service.impl.SavingService;

import java.util.Scanner;

public class SavingController {
    ISavingService iSavingService=new SavingService();
    public void menuSaving(){
        do {
            Scanner scanner=new Scanner(System.in);
            System.out.println("1.Thêm mới");
            System.out.println("2.Xóa ");
            System.out.println("3.Hiển thị");
            System.out.println("4.Tìm kiếm");
            System.out.println("5.Quay lại");
            System.out.println("Mời chọn: ");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iSavingService.addSaving();
                    System.out.println("Thêm thành công");
                    break;
                case 2:
                    System.out.println("Nhập mã ngân hàng muốn xóa : ");
                    String code=scanner.nextLine();
                    iSavingService.removeSaving(code);
                    break;
                case 3:
                    iSavingService.display();
                    break;
                case 4:
                    System.out.println("Nhập mã ngân hàng muốn tìm: ");
                    String code1=scanner.nextLine();
                    iSavingService.searchSaving(code1);
                    break;
                case 5:
                    return;
            }
        }while (true);
    }
}
