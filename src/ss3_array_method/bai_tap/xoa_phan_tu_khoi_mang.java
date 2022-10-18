package ss3_array_method.bai_tap;

import java.util.Scanner;

public class xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        int[] array = {1,2,4,5,6,7,8,9};
        System.out.println("\tMảng hiện có những số: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập số cần xóa khỏi mảng: ");
        int num = scanner.nextInt();
        System.out.println("Mảng sau khi xóa ");
        for (int a = 0; a < array.length; a++) {
            if (num == array[a]) {
                for (int j = a; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        for (int i=0;i<array.length-1;i++) {
            System.out.println(array[i]+",");
        }
    }
}