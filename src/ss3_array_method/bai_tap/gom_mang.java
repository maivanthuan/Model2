package ss3_array_method.bai_tap;

public class gom_mang {
    public static void main(String[] args) {
        int[] array1= {1,2,3,4,5};
        int[] array2={7,8,9,10,11};
        int len1= array1.length;
        int len2=array2.length;
        int[] arr=new int[len1+len2];
        int index=0;
        System.out.print("Mảng 1 là: ");
        for (int i=0;i<array1.length;i++) {
            System.out.print(" "+ array1[i]);
            arr[index]=array1[i];
            index++;
        }
        System.out.print("\n"+"Mảng 2 là: ");
        for (int i=0;i<array2.length;i++) {
            System.out.print(" "+array2[i]);
            arr[index]=array2[i];
            index++;
        }
        System.out.print("\n"+"mảng sau khi gộp: ");
        for (int i=0;i<arr.length;i++) {
            System.out.print(" "+arr[i]);
        }
    }
}
