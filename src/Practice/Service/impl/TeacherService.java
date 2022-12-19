package Practice.Service.impl;

import Practice.Model.Student;
import Practice.Model.Teacher;
import Practice.ReadAndWrite.ReadAndWriteTeacher;
import Practice.Repository.ITeacherRepository;
import Practice.Repository.impl.TeacherRepository;
import Practice.Service.ITeacherService;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    ReadAndWriteTeacher readAndWriteTeacher=new ReadAndWriteTeacher();
    ITeacherRepository iTeacherRepository=new TeacherRepository();
    List<Teacher>teacherList=iTeacherRepository.getAll();
    Scanner scanner=new Scanner(System.in);

    @Override
    public void addTeacher() {
        Teacher teacher=new Teacher();
        teacher.infor();
        iTeacherRepository.addTeacher(teacher);
    }

    @Override
    public void displayTeacher() {
        for (Teacher teacher:teacherList){
            System.out.println(teacher);
        }
    }

    @Override
    public void removeTeacher(String id) {
            Teacher studentObj=null;
            for (Teacher teacher:teacherList){
                if (teacher.getId().equals(id)){
                    studentObj=teacher;
                    break;
                }
            }
            if (studentObj!=null){
                do {
                    System.out.println("Bạn có chắc chắn xóa không: ");
                    System.out.println("1.Có");
                    System.out.println("2.Không");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            iTeacherRepository.removeTeacher(studentObj);
                            System.out.println("Xóa thành công");
                            break;
                        case 2:
                            return;
                    }
                }while (true);

            }else {
                System.out.println("Không tìm thấy");
            }
        }
    }
