package ss5_access_modifier.bai_tap.Circle;

public class Circletest {
    public static void main(String[] args) {
        Circle circle=new Circle(10.5,"red");
        double r= circle.getRadius();
        double a=circle.getArea();
        System.out.println("radius: "+r);
        System.out.println("Area: "+a);
    }
}
