package Case_study.Controller;

import java.util.Scanner;

public class BookingManager {
    private final Scanner scanner = new Scanner(System.in);
    public void bookmenu() {
        do {
            System.out.println("1.Add new booking.");
            System.out.println("2.Display list booking.");
            System.out.println("3.Create new contracts.");
            System.out.println("4.Display list contracts.");
            System.out.println("5.Edit contracts.");
            System.out.println("6.Return main menu.");
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
