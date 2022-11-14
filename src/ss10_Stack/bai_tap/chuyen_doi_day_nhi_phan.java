package ss10_Stack.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class chuyen_doi_day_nhi_phan {
    public static void chuyen(int num) {
        Stack<Integer> stack = new Stack<>();
        while (num > 0) {
            int temp = num % 2;
            stack.push(temp);
            num /= 2;
        }
        final int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("\n Nhập số cần chuyển đổi: ");
            int num=scanner.nextInt();
            chuyen(num);
        }while (true);
    }
}
