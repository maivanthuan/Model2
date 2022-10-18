package ss3_array_method.thuc_hanh;

import java.util.Scanner;

public class tim_gia_tri {
    public static void main(String[] args) {
        String[] Student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên muốn tìm");
        String str = scanner.nextLine();
        boolean isExit = false;
        for (int i=0;i<Student.length;i++) {
            if (Student[i].equals(str)) {
                System.out.println(str + " có xuất hiện trong dnah sách ở vị trí "+(i+1));
                isExit=true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("Không có "+ str + " trong danh sách");
        }
    }
}
