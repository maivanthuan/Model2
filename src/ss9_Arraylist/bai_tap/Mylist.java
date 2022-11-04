package ss9_Arraylist.bai_tap;

import java.util.ArrayList;
import java.util.List;

public class Mylist<E> {
    private int size=0;
    static final int DEFAULT_CAPACITY=10;
    Object element[];
    public Mylist() {
        element = new Object[DEFAULT_CAPACITY];

    }

    public void MyList(int capacity) {
        element = new Object[capacity];
    }

    public void add(E value) {
        if (size < this.element.length) {
            add(size, value);
            this.size++;
        } else {
            Object[] cloneArr = new Object[element.length + DEFAULT_CAPACITY];
            for (int i = 0; i < element.length; i++) {
                cloneArr[i] = element[i];
            }
            element = cloneArr;
            add(size, value);
            size++;
        }
    }

    public void add(int index, E element) {
        this.element[index] = element;
    }

    public boolean remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                element[i] = element[i + 1];
            }
            size--;
            return true;
        }
        return false;
    }
    public int size() {
        return this.size;
    }
    public boolean contains(E value) {
        for (int i=0;i<element.length;i++) {
            if (element[i]==value) {
                return true;
            }
        }
        return false;
    }

    public E get(int i) {
        return (E) element[i];
    }
    public int indexOf(E o) {
        for (int i=0;i<element.length;i++) {
            if (element[i]==o) {
                return i;
            }
        }
        return -1;
    }
    public void clear() {
        element=new Object[DEFAULT_CAPACITY];
        size=0;
    }

    public static void main(String[] args) {
        List<Integer> myList=new ArrayList<Integer>();
        Mylist<String>myList1=new Mylist<>();
        System.out.println(myList1.size());
    }
}
