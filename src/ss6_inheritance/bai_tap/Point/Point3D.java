package ss6_inheritance.bai_tap.Point;

public class Point3D extends Point2D{
        private float z=0.0f;

    public Point3D() {
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        setXY(x,y);
        this.z=z;
    }
    public float[] getXYZ() {
        float[] test2= new float[3];
        test2[0]=getX();
        test2[1]=getY();
        test2[2]=getZ();
        return test2;
    }

    @Override
    public String toString() {
            return "lop_3D{"+"x="+getX()+
                    ", "+"y="+getY()+
                    ", "+"z="+getZ()+
                    '}';
    }

    public static void main(String[] args) {
        Point2D point2D=new Point2D(1,2);
        Point3D point3D=new Point3D(3,4,5);
        System.out.println(point2D);
        System.out.println(point3D);
    }
}
