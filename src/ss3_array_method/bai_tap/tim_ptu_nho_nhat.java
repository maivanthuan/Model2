package ss3_array_method.bai_tap;

import java.util.Scanner;

public class tim_ptu_nho_nhat {
    public static void main(String[] args) {
        int[] arr;
        int size;
        do {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Nhập độ dài của mảng: ");
             size=scanner.nextInt();
            arr = new int[size];
            int i=0;
            while (i<arr.length) {
                System.out.println("Nhập phần tử của mảng: ");
                arr[i] =scanner.nextInt();
                i++;
            }
        }while (arr.length+1<size);
        System.out.println("Mảng là ");
        for (int j=0;j<arr.length;j++) {
            System.out.println(arr[j]+"\t");
        }
        int min=arr[0];
        for (int a=0;a<arr.length;a++) {
            if (min<arr[a]) {
                min=arr[a];
            }
        }
        System.out.println(min+ " là số nhỏ nhất");
    }
}
