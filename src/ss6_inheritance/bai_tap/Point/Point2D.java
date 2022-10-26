package ss6_inheritance.bai_tap;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x=x;
        this.y=y;
    }
    public float[] getXy() {
        float[] test= new float[2];
        test[0]=this.x;
        test[1]=this.y;
        return test;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point2D point2D= new Point2D();
        float i=1.1f;
        float o=2.2f;
        point2D.setX(i);
        point2D.setY(o);
        System.out.println(point2D.getX());
        System.out.println(point2D.getY());
    }
}
