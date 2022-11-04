package Case_study.Controller;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        EmployeeManager employeeManager=new EmployeeManager();
        CustomerManager customerManager=new CustomerManager();
        FacilityManager facilityManager=new FacilityManager();
        BookingManager bookingManager =new BookingManager();
        PromotionManger promotionManger=new PromotionManger();
        do {
            System.out.println("----------------------------");
            System.out.println("CHÀO MỪNG ĐẾN ỨNG DỰNG CỦA FURAMA");
            System.out.println("Nhập số để chọn tác vụ");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management ");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.EXIT");
            System.out.println("Mời chọn: ");
            int choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    employeeManager.emplmenu();
                    break;
                case 2:
                    customerManager.cusmenu();
                    break;
                case 3:
                    facilityManager.pacimenu();
                    break;
                case 4:
                    bookingManager.bookmenu();
                    break;
                case 5:
                    promotionManger.promenu();
                    break;
                case 6:
                    System.exit(0);
            }
        }while (true);

    }
}
