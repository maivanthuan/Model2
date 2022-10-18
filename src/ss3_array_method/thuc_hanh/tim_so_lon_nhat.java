package ss3_array_method.thuc_hanh;

import java.util.Scanner;

public class tim_so_lon_nhat {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài của mảng");
            size=scanner.nextInt();
            if (size>20) {
                System.out.println("Độ dài lớn nhất 20");
            }
        }while (size>20);
        array=new int[size];
        int i=0;
        while (i<array.length) {
            System.out.println("Nhập phần tử số "+(i+1)+": ");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.println("Mảng đã nhập: ");
        for (int j=0;j<array.length;j++) {
            System.out.println(array[j]);
        }
            int max=array[0];
            int index=1;
            for (int z=0;z<array.length;z++) {
                if(max<array[z]) {
                    max=array[z];
                    index=z+1;
                }
            }
        System.out.println("Số lớn nhất trong mảng là: "+max+" ở vị trí "+index);
    }
}
