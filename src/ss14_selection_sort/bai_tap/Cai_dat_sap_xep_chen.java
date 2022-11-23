package ss14_selection_sort.bai_tap;

public class Cai_dat_sap_xep_chen {
    int valueToInsert;
    int holePosition;
    int i;
    public void insertionSort(int[] arr){
        for (i=1;i<arr.length;i++){
            valueToInsert=arr[i];
            holePosition=i;
            while (holePosition>0&&arr[holePosition-1]>valueToInsert){
                arr[holePosition]=arr[holePosition-1];
                holePosition--;
            }
            if (holePosition!=i){
                arr[holePosition]=valueToInsert;
            }
        }
    }
    public  void display(int[] arr){
        System.out.print("[");
        for (int ar:arr){
            System.out.print(ar+" ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int[] arr={5,2,61,12,24,3,10};
        Cai_dat_sap_xep_chen cai_dat_sap_xep_chen=new Cai_dat_sap_xep_chen();
        System.out.println("Mảng ban đầu: ");
        cai_dat_sap_xep_chen.display(arr);
        cai_dat_sap_xep_chen.insertionSort(arr);
        System.out.println("\n Mảng sau khi xếp: ");
        cai_dat_sap_xep_chen.display(arr);
    }
    }

