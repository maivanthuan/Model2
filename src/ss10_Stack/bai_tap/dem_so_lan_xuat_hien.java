package ss10_Stack.bai_tap;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class dem_so_lan_xuat_hien {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap=new TreeMap<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi: ");
            String str=scanner.nextLine();
            String[] arr=str.split("");
        System.out.println("mảng sau khi nhập: "+ Arrays.toString(arr));
        for (String s:arr){
            if (treeMap.containsKey(s)){
                int count= treeMap.get(s);
                count++;
                treeMap.put(s,count);
            }else {
                treeMap.put(s,1);
            }
        }
        System.out.println(treeMap);
    }

}
