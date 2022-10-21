package ss3_array_method.bai_tap;

import java.util.Scanner;

public class so_lan_xuat_hien {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi bất kì: ");
        String str=scanner.nextLine();
        System.out.println("Chuỗi nhập vào: "+str);
        char kitu='a';
        System.out.println("Kí tự kiểm tra: "+kitu);
        int dem =0;
        for (int i =0;i<str.length();i++) {
            if (str.charAt(i) == kitu) {
                dem++;
            }
        }
        System.out.println("Kí tự " +kitu+" xuất hiện "+ dem +" lần");

    }
    }
