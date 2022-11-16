package ss10_Stack.bai_tap;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class chuoi_Palindrome {
    public static void palindrome(String str) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        String[] arr = str.split("");
        for (int i = 0; i < str.length(); i++) {
            stack.push(arr[i]);
            queue.offer(arr[i]);
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String stackValue = stack.pop();
            String queueValue = queue.poll();
            if (stackValue.equals(queueValue)) {
                count++;
            }
        }
        if (count == arr.length) {
            System.out.println("This is palindrome");
        } else {
            System.out.println("No ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n Nhập dãy cần kiểm tra: ");
            String str=scanner.nextLine();
            palindrome(str);
        }while (true);
    }
}

