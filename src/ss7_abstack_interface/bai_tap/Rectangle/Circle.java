package ss7_abstack_interface.bai_tap.Rectangle;

public class Circle implements Resizeable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double Area() {
        return radius*radius*Math.PI;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area="+Area()+
                '}';
    }

    @Override
    public void resize(double percent) {
        radius=radius*radius*percent;

    }
}
