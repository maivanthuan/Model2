package Practice.Repository.impl;

import Case_study.ReadAndWrite.ReadAndWriteEmployee;
import Practice.Model.Teacher;
import Practice.ReadAndWrite.ReadAndWriteTeacher;
import Practice.Repository.ITeacherRepository;

import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    ReadAndWriteTeacher readAndWriteTeacher=new ReadAndWriteTeacher();
    List<Teacher>teacherList=readAndWriteTeacher.readFileStudent(FILE_TEACHER);

    @Override
    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
        readAndWriteTeacher.writeFileStudent(FILE_TEACHER,teacherList);
    }
    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }

    @Override
    public void removeTeacher(Teacher teacher) {
        teacherList.remove(teacher);
        readAndWriteTeacher.writeFileStudent(FILE_TEACHER,teacherList);
    }
}
