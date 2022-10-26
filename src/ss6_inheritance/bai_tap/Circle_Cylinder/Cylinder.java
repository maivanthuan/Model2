package ss6_inheritance.bai_tap.Circle_Cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getvolume(){
        return Math.PI*getRadius()*getRadius()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +"," +
                " volume=" + getvolume()+
                '}';
    }

    public static void main(String[] args) {
        Circle circle=new Circle(20,"hồng nè");
        System.out.println(circle);
        Cylinder cylinder=new Cylinder(10,"đen nè",20);
        System.out.println(cylinder);
    }
}
