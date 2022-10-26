package ss4_class_obiect.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
        private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        return b*b-(4*a*c);
    }
    public double getRoot1() {
        return (-b+Math.sqrt(b*b-4*a*c))/2*a;
    }
    public double getRoot2() {
        return (-b-Math.sqrt(b*b-4*a*c))/2*a;
    }
    public double getkep() {
        return (-b/2*a);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a=scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b=scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c=scanner.nextDouble();
        QuadraticEquation neww= new QuadraticEquation(a,b,c);
        System.out.println("delta: "+neww.getDiscriminant());
        if (neww.getDiscriminant()<0) {
            System.out.println("Hàm vô nghiệm");

        }else if (neww.getDiscriminant()==0){
            System.out.println(("Nghiệm kép là: "+neww.getkep()));
        }else {
            System.out.println("Nghiệm thứ nhất: "+neww.getRoot1());
            System.out.println("Nghiệm thứ hai: "+neww.getRoot2());
        }
    }
}
