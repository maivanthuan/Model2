package ss13_Binary_search.bai_tap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Binary {
    public static int Binary(int[] arr, int left, int right, int value){
        if (left<=right){
            int middle=(left+right)/2;
            if (arr[middle]==value){
                return middle;
            }else if (arr[middle]>value){
                return Binary(arr, left, middle-1, value);
                }else {
                return Binary(arr,middle+1,right,value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[5];
        arr[0]=12;
        arr[1]=42;
        arr[2]=21;
        arr[3]=51;
        arr[4]=9;
        System.out.print ("Mảng trước khi sắp xếp: ");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.print ("Mảng sau khi sắp xếp: ");
        System.out.println(Arrays.toString(arr));
        int value=1;
        System.out.println("index của "+ value+" là "+Binary(arr,0,arr.length-1,value));

    }
}
