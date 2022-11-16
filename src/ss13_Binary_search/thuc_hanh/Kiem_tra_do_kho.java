package ss13_Binary_search.thuc_hanh;

import java.util.Scanner;

public class Kiem_tra_do_kho {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input=scanner.nextLine();
        int[] frequentchar=new int[255];
        for (int i=0;i<input.length();i++){
            int ascii=input.charAt(i);
            frequentchar[ascii]+=1;
        }
        int max=0;
            char charater=(char) 255;
            for (int j=0;j<255;j++){
                if (frequentchar[j]>max){
                    max=frequentchar[j];
                    charater=(char) j;
                }
            }
        System.out.println("The most appearing letter is '" + charater + "' with a frequency of " + max + " times");
    }
}
