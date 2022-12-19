package Practice.Service.impl;

import Practice.Model.Student;
import Practice.Repository.IStudentRepository;
import Practice.Repository.impl.StudentRepository;
import Practice.Service.IStudentService;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    Scanner scanner=new Scanner(System.in);
    IStudentRepository iStudentRepository=new StudentRepository();
    List<Student>studentList=iStudentRepository.getAll();
    @Override
    public void addStudent() {
        Student student=new Student();
        student.infor();
        iStudentRepository.addStudent(student);
    }

    @Override
    public void displayStudent() {
        for (Student student:studentList){
            System.out.println(student);
        }
    }
    @Override
    public void removeStudent(String id) {
        Student studentObj=null;
        for (Student student:studentList){
            if (student.getId().equals(id)){
                studentObj=student;
                break;
            }
        }
        if (studentObj!=null){
                System.out.println("Bạn có chắc chắn xóa không: ");
                System.out.println("1.Có");
                System.out.println("2.Không");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        iStudentRepository.removeStudent(studentObj);
                        System.out.println("Xóa thành công");
                        break;
                    case 2:
                       return;
                }
        }else {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void searchStudent(String id) {
        Student student1=null;
        for (Student student:studentList){
            if (student.getId().equals(id)){
                student1=student;
                break;
            }
        }
        if (student1!=null){
            System.out.println("Tìm kiếm thành công: ");
            System.out.println(student1);
        }else {
            System.out.println("Không tìm thấy");
        }
    }
}
