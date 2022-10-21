package ss3_array_method.bai_tap;

import java.util.Scanner;

public class tong_cot_xac_dinh {
    public static void main(String[] args) {
        int[][] array={
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };
        System.out.println("Mảng 2 chiều là: ");
        for (int i=0; i<array.length;i++) {
            for (int j=0;j<array[i].length;j++) {
                System.out.print(array[i][j]+",");
            }
            System.out.println("\t");
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập cột muốn tính tổng: ");
        int num=scanner.nextInt();
        if (num>array[0].length) {
            System.out.println("Nhập lại");
        }else {
            int total=0;
            for (int i=0;i<array.length;i++) {
                total= total + array[i][num-1];
            }
            System.out.println("Tổng các phần cột "+ num+ " là: "+total);
        }
    }
}
