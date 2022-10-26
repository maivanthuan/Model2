package ss4_class_obiect.bai_tap.fan;

public class fann {
    private final int SLOW=1;
    private final int MEDIUM=2;
    private final int FASt=3;
    private int speed=SLOW;
    private boolean on=false;
    private double radius=5;
    private String color="blue";
    public fann(){
    }

    public fann(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFASt() {
        return FASt;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString()  {
        String infor="";
        if (this.on) {
            infor+= "Speed: "+this.speed+" radius: "+this.radius+" color: "+this.color+"\n Fan đang bật";
        }else {
            infor+="Color: "+this.color+" radius: "+this.radius+"\n fan đang tắt";
        }
        return infor;
    }

    public static void main(String[] args) {
        fann Fan1=new fann(3,true,15,"yellow");
        fann Fan2=new fann(1,false,5,"Blue");
        System.out.println("Fan 1: "+Fan1.toString());
        System.out.println("Fan 2: "+Fan2.toString());
    }
}
