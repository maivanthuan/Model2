package Case_study.Controller;

import java.util.Scanner;

public class FacilityManager {
    private final Scanner scanner = new Scanner(System.in);
    public void pacimenu() {
        do {
            System.out.println("----Facility Manager----");
            System.out.println("1.Display list facility");
            System.out.println("2.Add new facility");
            System.out.println("3.Display maintenance");
            System.out.println("4.Return main menu");
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
