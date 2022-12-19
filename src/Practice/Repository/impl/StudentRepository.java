package Practice.Repository.impl;

import Case_study.ReadAndWrite.ReadAndWriteEmployee;
import Practice.Model.Student;
import Practice.ReadAndWrite.ReadAndWriteStudent;
import Practice.Repository.IStudentRepository;

import java.util.List;

public class StudentRepository implements IStudentRepository {
    ReadAndWriteStudent readAndWriteStudent=new ReadAndWriteStudent();
    List<Student>studentList=readAndWriteStudent.readFileStudent(FILE_STUDENT);
    @Override
    public void addStudent(Student student) {
        studentList.add(student);
        readAndWriteStudent.writeFileStudent(FILE_STUDENT,studentList);
    }
    @Override
    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public void removeStudent(Student student) {
        studentList.remove(student);
        readAndWriteStudent.writeFileStudent(FILE_STUDENT,studentList);
    }
}
