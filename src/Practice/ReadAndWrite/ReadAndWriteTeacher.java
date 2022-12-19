package Practice.ReadAndWrite;

import Practice.Model.Student;
import Practice.Model.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteTeacher {
    public List<Teacher> readFileStudent(String filePath){
        List<Teacher>teacherList=new ArrayList<>();
        FileReader fileReader;
        BufferedReader br=null;
        try {
            fileReader=new FileReader(filePath);
            br= new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line=br.readLine())!=null){
                temp=line.split(",");
                String id=temp[0];
                String name=temp[1];
                String dateOfBirth=temp[2];
                String gender=temp[3];
                String specialize=temp[4];
                Teacher teacher =new Teacher(id,name,dateOfBirth,gender,specialize);
                teacherList.add(teacher);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return teacherList;
    }
    public void writeFileStudent(String filePath, List<Teacher>teacherList){
        FileWriter fileWriter;
        BufferedWriter brw=null;
        try {
            fileWriter=new FileWriter(filePath);
            brw=new BufferedWriter(fileWriter);
            StringBuilder str=new StringBuilder();
            for (Teacher teacher:teacherList){
                str.append(teacher.getId()).append(",").append(teacher.getName()).append(",").append(teacher.getGender()).append(",").append(teacher.getDateOfBirth()).append(",").append(teacher.getSpecialize());
            }
            if (str.length()>0){
                brw.write(str.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                brw.close();
            }catch (IOException e){
                throw new RuntimeException();
            }
        }
    }
}
