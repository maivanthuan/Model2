package ss14_selection_sort.bai_tap;

public class MH_Sap_xep_chen {
    public  void insertionSort(int[] arr){
        int valueToInsert;
        int holePosition;
        int i;
        for (i=1;i<arr.length;i++){
            valueToInsert=arr[i];
            holePosition=i;
            while (holePosition>0&&arr[holePosition-1]>valueToInsert){
                arr[holePosition]=arr[holePosition-1];
                holePosition--;
                System.out.println("Di chuyển phần tử "+arr[holePosition]);
            }
            if (holePosition!=i){
                System.out.println("CHèn phần tử: "+valueToInsert+" tại vị trí "+holePosition);
                arr[holePosition]=valueToInsert;
            }
            System.out.println("Vòng lập thứ: "+i);
            display(arr);
        }
    }
    public  void display(int[] arr){
        int i;
        System.out.print("[");
        for (i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        int arr[] = { 6, 7, 0, 2, 8, 1, 3, 9, 4, 5 };
        MH_Sap_xep_chen sap_xep_chen=new MH_Sap_xep_chen();
        System.out.println("Mảng lúc đầu: ");
        sap_xep_chen.display(arr);
        System.out.println("-----------------------");
        sap_xep_chen.insertionSort(arr);
        System.out.println("-----------------------");
        System.out.println("\nMảng sau khi sắp xếp: ");
        sap_xep_chen.display(arr);
    }
}
