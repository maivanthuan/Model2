package ss17_binary_file.thuc_hanh.Danh_sach_sv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student>studentList=new ArrayList<>();
        studentList.add(new Student(1,"Mai VĂN Thuận","Đà nẵng"));
        studentList.add(new Student(2,"Trần Lê Hiền Mai","Đăk Lắk"));
        studentList.add(new Student(3,"Mai VĂN Thuận","Đà nẵng"));
        studentList.add(new Student(4,"Mai VĂN Thuận","Đà nẵng"));
        studentList.add(new Student(5,"Mai VĂN Thuận","Đà nẵng"));
        writeToFile("C:\\codegym\\Model2\\src\\ss17_binary_file\\thuc_hanh\\Danh_sach_sv\\student.txt", studentList);
        List<Student> studentList1=readDataFromFile("C:\\codegym\\Model2\\src\\ss17_binary_file\\thuc_hanh\\Danh_sach_sv\\student.txt");
        for (Student student:studentList1){
            System.out.println(student);
        }
    }
    public static void writeToFile(String path, List<Student>student) {
        try {
            FileOutputStream fos=new FileOutputStream(path);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(student);
            fos.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student>readDataFromFile(String path){
        List<Student>studentList=new ArrayList<>();
        try {
            FileInputStream fis=new FileInputStream(path);
            ObjectInputStream ois=new ObjectInputStream(fis);
            studentList=(List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return studentList;
    }
}
