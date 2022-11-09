package ss10_Stack.bai_tap;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Scanner;

public class dap_nguoc_phan_tu<T> {
    private final LinkedList<T>stack;


    public dap_nguoc_phan_tu() {
        stack=new LinkedList<>();
    }
    public int size(){
        return stack.size();
    }
    public void push(T e){
        stack.addFirst(e);
    }
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
    public T pop() {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    void printf(){
        if (stack.size()==0){
            System.out.println("empty");
        }else {
            for (int i=0;i<stack.size();i++) {
                System.out.println(stack.get(i));
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        dap_nguoc_phan_tu<Integer>reverse=new dap_nguoc_phan_tu<>();
        System.out.println("Nhập vào số lượng phânr tử trong mảng: ");
        int size=scanner.nextInt();
        for (int i=0;i<size;i++) {
            System.out.println("Nhập phần tử số: "+(i+1)+":");
            int e=scanner.nextInt();
            reverse.push(e);
        }
        System.out.println("Mảng đã nhập: ");
        reverse.printf();
        int size1=reverse.size();
        dap_nguoc_phan_tu<Integer> dap_nguoc_phan_tu1=new dap_nguoc_phan_tu<>();
        for (int i=0;i<size1;i++){
            dap_nguoc_phan_tu1.push(dap_nguoc_phan_tu1.pop());
        }
        System.out.println("Mảng sau khi đảo: ");
        dap_nguoc_phan_tu1.printf();
        }
    }


