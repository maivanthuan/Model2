package Practice.ReadAndWrite;

import Practice.Model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteStudent {
    public List<Student> readFileStudent(String filePath){
        List<Student>studentList=new ArrayList<>();
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
                String clas=temp[4];
                String score=temp[5];
                Student student=new Student(id,name,dateOfBirth,gender,clas,score);
                studentList.add(student);
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
        return studentList;
    }
    public void writeFileStudent(String filePath, List<Student>studentList){
        FileWriter fileWriter;
        BufferedWriter brw=null;
        try {
            fileWriter=new FileWriter(filePath);
            brw=new BufferedWriter(fileWriter);
            StringBuilder str=new StringBuilder();
            for (Student student:studentList){
                str.append(student.getId()).append(",").append(student.getName()).append(",").append(student.getGender()).append(",").append(student.getDateOfBirth()).append(",").append(student.getClas()).append(",").append(student.getScore()).append("\n");
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
