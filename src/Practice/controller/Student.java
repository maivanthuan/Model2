package Practice.controller;

import Practice.Service.IStudentService;
import Practice.Service.impl.StudentService;

import java.util.Scanner;

public class Student {
    IStudentService iStudentService=new StudentService();
    public void menuStudent(){
        do {
            Scanner scanner=new Scanner(System.in);
            System.out.println("1.Thêm mới");
            System.out.println("2.Hiển thị");
            System.out.println("3.Xóa ");
            System.out.println("4.Tìm kiếm");
            System.out.println("5.Quay lại");
            System.out.println("Mời chọn: ");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iStudentService.addStudent();
                    System.out.println("Thêm thành công");
                    break;
                case 2:
                    iStudentService.displayStudent();
                    break;
                case 3:
                    System.out.println("Nhập id bạn muốn xóa: ");
                    String id=scanner.nextLine();
                    iStudentService.removeStudent(id);
                    break;
                case 4:
                    System.out.println("Nhập id bạn muốn tìm: ");
                    String code =scanner.nextLine();
                    iStudentService.searchStudent(code);
                    break;
                case 5:
                    return;

            }
        }while (true);

    }
}
