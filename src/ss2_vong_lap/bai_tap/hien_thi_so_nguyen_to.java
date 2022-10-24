package ss2_vong_lap.bai_tap;

import java.util.Scanner;

public class hien_thi_so_nguyen_to {
    public static void main(String[] args) {
        int number;
        int dem ;
        int count=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bạn muốn hiển thị:  ");
        number = scanner.nextInt();
        System.out.println(number +" số nguyên tố là: ");
        for (int i = 1; i > 0; i++) {
            dem = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    dem++;
                }
            }
            if (dem == 2) {
                System.out.printf(i + " ");
                count++;
            }
            if (count == number) {
                break;
            }
        }
    }
}
