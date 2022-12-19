package Practice.Model;

import java.util.Scanner;

public class Teacher extends Person{
    private String specialize;

    public Teacher() {
    }
    public Teacher(String id, String name, String gender, String dateOfBirth, String specialize) {
        super(id, name, gender, dateOfBirth);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                "specialize='" + specialize + '\'' +
                '}';
    }

    @Override
    public void infor() {
        Scanner scanner = new Scanner(System.in);
       inforPerson();
        System.out.println("Nhập chuyên môn: ");
        String specialize=scanner.nextLine();
    }
}
