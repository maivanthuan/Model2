package ss3_array_method.bai_tap;

import java.util.Scanner;

public class them_ptu {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        System.out.print("Mảng hiện có: ");
        for (int i =0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
        int arr= array.length+1;
        int[] arr1 = new int[arr];
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Nhập vị trí cần thêm: ");
        int index= scanner.nextInt();
        System.out.println("Nhap so can them:");
        int number = scanner.nextInt();
        if (index<=1 || index>=array.length-1) {
            System.out.println("Không chèn được phần tử vào mảng");
        }else {
            for (int i=0;i<arr1.length-1;i++) {
                arr1[i]=array[i];
            }
            for (int i=0 ;i<arr1.length;i++) {
                if (index==i+1) {
                    for (int j=arr1.length-1;j>i;j--) {
                        arr1[j] = arr1[j-1];
                    }
                    arr1[i]=number;
                }
            }
            System.out.printf("Mảng đã thay đổi là: ");
            for (int i=0;i<arr1.length;i++) {
                System.out.printf(" "+ arr1[i]+" ");
            }
        }
    }
}
