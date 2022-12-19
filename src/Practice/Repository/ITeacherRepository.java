package Practice.Repository;

import Practice.Model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    String FILE_TEACHER="src/Practice/Data/teacher.csv";
    void addTeacher(Teacher teacher);
    List<Teacher>getAll();
    void removeTeacher(Teacher teacher);
}
