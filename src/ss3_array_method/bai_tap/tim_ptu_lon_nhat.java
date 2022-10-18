package ss3_array_method.bai_tap;

public class tim_ptu_lon_nhat {
    public static void main(String[] args) {
        int[][] array= {
                {1,2,3,4,5,9},
                {32,13,21,43,12,14},
                { 75,43,25,61,28,83}
        };
        System.out.println("Mảng 2 chiều là: ");
        for (int i=0;i<array.length;i++) {
            for (int j=0;j<array[i].length;j++) {
                System.out.print(array[i][j]+",");
            }
            System.out.print("\n");
        }
        int max= array[0][0];
        for (int i =0;i<array.length;i++) {
            for (int j=0;j<array[i].length;j++) {
                if (array[i][j]>max) {
                    max=array[i][j];
                }
            }
        }
        System.out.println("Số lớn nhất là: " + max);
    }
}
