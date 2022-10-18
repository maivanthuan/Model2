package ss3_array_method.thuc_hanh;

import java.util.Scanner;

public class dao_nguoc {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size=scanner.nextInt();
            if (size>20) {
                System.out.println("Size does not exceed 20");
            }
        }while (size>20);
        arr=new int[size];
        int i=0;
        while (i < arr.length) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr[i]=scanner.nextInt();
            i++;
        }
        for (int j=0 ; j<arr.length/2 ; j++) {
            int temp = arr[j];
            arr[j]=arr[ size - 1 - j];
            arr[size - 1 - j ]=temp;
        }
        System.out.println("Reverse array");
        for (int j=0;j<arr.length;j++) {
            System.out.println(arr[j]+"\t");
        }
        }
    }
