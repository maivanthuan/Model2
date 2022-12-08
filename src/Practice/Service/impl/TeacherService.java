package Practice.Service.impl;

import Practice.Model.Teacher;
import Practice.ReadAndWrite.ReadAndWriteTeacher;
import Practice.Repository.ITeacherRepository;

import java.util.List;
import java.util.Scanner;

public class TeacherRepository implements ITeacherRepository {
    ReadAndWriteTeacher readAndWriteTeacher=new ReadAndWriteTeacher();
    ITeacherRepository iTeacherRepository=new TeacherRepository();
    Scanner scanner=new Scanner(System.in);

    @Override
    public void addTeacher(Teacher teacher) {
        Teacher teacher1=new Teacher();
        
    }

    @Override
    public List<Teacher> getAll() {
        return null;
    }

    @Override
    public void removeTeacher(Teacher teacher) {

    }
}
