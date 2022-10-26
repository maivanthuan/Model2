package ss6_inheritance.bai_tap.Point_MoveablePoint;

public class Point {
    private float x=0.0f;
    private float y=0.0f;

    public Point() {
    }

    public Point(float x, float y) {
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
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY() {
        float[] test=new float[2];
        test[0]=this.x;
        test[1]=this.x;
        return test;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point point=new Point(1,2);
        System.out.println(point);
    }
}
