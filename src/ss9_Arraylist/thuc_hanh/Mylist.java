package ss9_Arraylist.thuc_hanh;

import java.util.Arrays;

public class Mylist<E>{
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object[] element;

    public Mylist() {
        element=new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int newSize=element.length*2;
        element= Arrays.copyOf(element, newSize);
    }
    public void add(E e){
        if (size==element.length){
            ensureCapa();
        }
        element[size++]=e;
    }
    public E get(int i){
        if (i>=size||i<0) {
            throw new IndexOutOfBoundsException("Index: "+i+", size "+i);
        }
        return (E) element[i];
    }

    public static void main(String[] args) {
        Mylist<Integer> integerMylist= new Mylist<Integer>();
        integerMylist.add(1);
        integerMylist.add(2);
        integerMylist.add(3);
        integerMylist.add(4);
        System.out.println("element 4: "+integerMylist.get(4));
        System.out.println("element 1: "+integerMylist.get(1));
        System.out.println("element 2: "+integerMylist.get(2));
        integerMylist.get(-1);
        System.out.println("element -1: " + integerMylist.get(-1));
    }
}
