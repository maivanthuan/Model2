package Case_study.Controller;

import java.util.Scanner;

public class PromotionManger {
    private final Scanner scanner = new Scanner(System.in);
    public void promenu() {
        do {
            System.out.println("1.Display list customers use service.");
            System.out.println("2.Display list customer get voucher.");
            System.out.println("4.Return main menu.");
            System.out.println("Mời chọn: ");
            int choice= Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return;
            }
        }while (true);
    }
}
