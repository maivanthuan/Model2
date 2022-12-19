package Practice.Model;

import java.util.Scanner;

public class Student extends Person {
    private String clas;
    private String score;

    public Student() {
    }

    public Student(String id, String name, String gender, String dateOfBirth, String clas, String score) {
        super(id, name, gender, dateOfBirth);
        this.clas = clas;
        this.score = score;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                "clas='" + clas + '\'' +
                ", score='" + score + '\'' +
                '}';
    }

    @Override
    public void infor() {
        Scanner scanner=new Scanner(System.in);
        inforPerson();
        System.out.println("Nhập lớp: ");
        this.clas = scanner.nextLine();
        System.out.println("Nhập điểm: ");
        this.score = scanner.nextLine();
    }
}
