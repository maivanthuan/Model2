package ss5_access_modifier.bai_tap.lop_chi;

public class Student {
    private String name="John";
    private String classes="CO2";

    public Student() {
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
        Student student=new Student();
        String name="thuận";
        String classes="A07";
        student.setName(name);
        student.setClasses(classes);
        System.out.println("Tên: "+name+" lớp: "+classes);
    }
}