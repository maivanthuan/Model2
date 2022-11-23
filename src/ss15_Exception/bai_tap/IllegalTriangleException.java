package ss15_Exception.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException {
    public void checkException(int a, int b, int c) throws exception {
        if (a+b<=c||b+c<=a||a+c<=b){
            throw new exception("Lỗi : 2 cạnh cộng lại bé hơn or bằng 1 cạnh");
        }else {
            System.out.println("Hợp lệ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        IllegalTriangleException illegalTriangleException=new IllegalTriangleException();
        try {
            System.out.println("Nhập cạnh 1:  ");
            int a=scanner.nextInt();
            System.out.println("Nhập cạnh 2: ");
            int b=scanner.nextInt();
            System.out.println("Nhập cạnh 3: ");
            int c=scanner.nextInt();
            try {
                illegalTriangleException.checkException(a,b,c);
            } catch (exception e) {
                System.out.println(e.getMessage());
            }
        }catch (Exception e){
            System.out.println("Không đúng định dạng");
        }
    }
}
