package ss3_array_method.bai_tap;

public class tinh_tong_duong_cheo {
    public static void main(String[] args) {
        int[][] array={
                {21,4,31,32,21},
                {2,4,29,22,42},
                {3,24,21,53,32},
                {312,4,21,32,2},
                {66,4,43,23,23},
        };
        System.out.println("Mảng 2 chiều là: ");
        for (int i=0;i<array.length;i++) {
            for (int j=0; j<array[i].length;j++) {
                System.out.print(array[i][j]+",");
            }
            System.out.println("\t");
        }
        int total=0;
        for (int i=0;i<array.length;i++) {
            total= total +array[i][i];

        }
        System.out.println("Tổng đường chéo là: "+total);
    }
}
