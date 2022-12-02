package Case_study.Controller;

import Case_study.Service.IEmployeeService;
import Case_study.Service.impl.EmployeeService;

import java.util.Scanner;
import java.util.Vector;

public class EmployeeManager {
    IEmployeeService iEmployeeService=new EmployeeService();
    private final Scanner scanner = new Scanner(System.in);
    public void emplmenu() {
        do {
            System.out.println("----Employee Manager----");
            System.out.println("1.Display list employees");
            System.out.println("2.Add new employee");
            System.out.println("3.Edit employee");
            System.out.println("4.Return main menu");
            System.out.println("Mời chọn: ");
            int choice= Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iEmployeeService.display();
                    break;
                case 2:
                    iEmployeeService.add();
                    break;
                case 3:
                    System.out.println("Nhập mã sản phẩm muốn sửa:");
                    String id=scanner.nextLine();
                    iEmployeeService.edit(id);
                    break;
                case 4:
                    return;
            }
        }while (true);
    }
}
