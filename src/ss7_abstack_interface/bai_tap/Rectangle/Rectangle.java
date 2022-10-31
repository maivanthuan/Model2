package ss7_abstack_interface.bai_tap.Rectangle;

public class Rectangle implements Resizeable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double Area() {
        return height*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area="+Area()+
                '}';
    }

    @Override
    public void resize(double percent) {
        height=height*height*percent;
        width=width*width*percent;
    }
}
