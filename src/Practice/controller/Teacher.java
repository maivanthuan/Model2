package Practice.controller;

import Practice.Service.ITeacherService;
import Practice.Service.impl.TeacherService;

import java.util.Scanner;

public class Teacher {
    ITeacherService iTeacherService=new TeacherService();
    public void menuTeacher(){
       do {
           Scanner scanner=new Scanner(System.in);
           System.out.println("1.Thêm mới ");
           System.out.println("2.Hiển thị");
           System.out.println("3.Xóa");
           System.out.println("4.Quay lại");
           System.out.println("Mời chọn: ");
           int choice=Integer.parseInt(scanner.nextLine());
           switch (choice){
               case 1:
                   iTeacherService.addTeacher();
                   break;
               case 2:
                   iTeacherService.displayTeacher();
                   break;
               case 3:
                   System.out.println("Nhập mã số bạn cần xóa: ");
                   String id =scanner.nextLine();
                   iTeacherService.removeTeacher(id);
                   break;
               case 4:
                   return;
           }
       }while (true);
    }
}
