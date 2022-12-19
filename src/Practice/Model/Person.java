package Practice.Model;

import java.util.Objects;
import java.util.Scanner;

public abstract class Person {
    protected String id;
    protected String name;
    protected String gender;
    protected String dateOfBirth;
    protected Person(){}

    public Person(String id, String name, String gender, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    public abstract void  infor();
    public void inforPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã: ");
        this.id = scanner.nextLine();
        System.out.println("Nhập tên: ");
        this.name = scanner.nextLine();
        System.out.println("NHập giới tính: ");
        this.gender = scanner.nextLine();
    }
}
