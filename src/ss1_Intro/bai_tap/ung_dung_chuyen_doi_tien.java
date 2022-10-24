package ss1_Intro.bai_tap;

import java.util.Scanner;

public class ung_dung_chuyen_doi_tien {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập số tiền bạn muốn chuyển: ");
        double money=scanner.nextDouble();
        double vnd=money*23000;
        System.out.println("Tiền sau khi đổi: "+vnd);
    }

}
