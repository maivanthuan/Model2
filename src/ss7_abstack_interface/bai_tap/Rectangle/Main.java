package ss7_abstack_interface.bai_tap.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle[] circles=new Circle[2];
        circles[0]=new Circle(2);
        circles[1]= new Circle(3);
        System.out.println("Hình tròn khi chưa đổi: ");
        for (Circle circle:circles) {
            System.out.println(circle);
        }
        System.out.println("\nsau khi thay đổi: ");
        for (Circle circle2:circles)  {
            double percent=Math.random();
            circle2.resize(percent);
            System.out.println(circle2);
    }
        Rectangle[] rectangle= new Rectangle[2];
        rectangle[0]=new Rectangle(10,5);
        rectangle[1]=new Rectangle(12,7);
        System.out.println("\nHình chữ nhật lúc chưa thay đổi");
        for (Rectangle rectangle1:rectangle){
            System.out.println(rectangle1);
        }
        System.out.println("\nHình chữ nhật sau khi thay đổi: ");
        for (Rectangle rectangle1:rectangle) {
            double percent=Math.random();
            rectangle1.resize(percent);
            System.out.println(rectangle1);
        }
}
}
