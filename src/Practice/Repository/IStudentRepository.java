package Practice.Repository;

import Practice.Model.Student;

import java.util.List;

public interface IStudentRepository {
    String FILE_STUDENT="src/Practice/Data/student.csv";
    void addStudent(Student student);
    List<Student>getAll();
    void removeStudent(Student student);
}
