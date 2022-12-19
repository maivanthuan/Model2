package Practice.controller;

import Practice.Service.IStudentService;
import Practice.Service.ITeacherService;
import Practice.Service.impl.StudentService;
import Practice.Service.impl.TeacherService;

import java.util.Scanner;

public class School {
    Student student=new Student();
    Teacher teacher=new Teacher();
    public static void main(String[] args) {
        Student student=new Student();
        Teacher teacher=new Teacher();
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("-----QUẢN LÝ HỌC SINH VÀ GIÁO VIÊN-----");
            System.out.println("1.Quản lý học sinh");
            System.out.println("2.Quản lý giáo viên");
            System.out.println("3.Thoát");
            System.out.println("Mời chọn");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    student.menuStudent();
                    break;
                case 2:
                    teacher.menuTeacher();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}
