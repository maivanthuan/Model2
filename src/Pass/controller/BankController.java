package Pass.controller;

import java.util.Scanner;

public class BankController {
    public static void main(String[] args) {
        PaymentController paymentController=new PaymentController();
        SavingController savingController=new SavingController();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("----------ỨNG DỤNG QUẢN LÝ NGÂN HÀNG----------");
            System.out.println("1.Ngân Hàng tiết kiệm");
            System.out.println("2.Tài khoản thanh toán");
            System.out.println("3.Thoát ứng dụng");
            System.out.println("Mời chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    savingController.menuSaving();
                    break;
                case 2:
                    paymentController.menuPayment();
                    break;
                case 3:
                    System.exit(0);
            }
        }while (true);
    }
}
