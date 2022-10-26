package ss5_access_modifier.bai_tap.Circle;

public class Circle {
    private double radius=1.0;
    private String color="red";

    public Circle() {
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius;
    }
}
