package Case_study.Service.impl;

import Case_study.Model.Customer;
import Case_study.Repository.ICustomerRepository;
import Case_study.Repository.impl.CustomerRepository;
import Case_study.Service.ICustomerService;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    ICustomerRepository iCustomerRepository=new CustomerRepository();
    Scanner scanner=new Scanner(System.in);
    Customer  customer= new Customer();
    @Override
    public void add() {
        customer.inforCustomer();
        iCustomerRepository.addCustomer(customer);
    }

    @Override
    public void display() {
        List<Customer>customerList=iCustomerRepository.getAll();
        for (Customer customer1:customerList){
            System.out.println(customer1);
        }
    }

    @Override
    public void edit(String id) {
        List<Customer>customerList=iCustomerRepository.getAll();
        for (Customer customer1:customerList){
            if(customer1.getId().equals(id)){
                do {
                    System.out.println("1.Sửa mã");
                    System.out.println("2.Sửa tên");
                    System.out.println("3.Sửa ngày sinh");
                    System.out.println("4.Sửa giới tính");
                    System.out.println("5.Sửa số CMND");
                    System.out.println("6.Sửa số điện thoại");
                    System.out.println("7.Sửa email");
                    System.out.println("8.Thoát");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            System.out.println("Nhập mã: ");
                            String code = scanner.nextLine();
                            customer.setId(code);
                            break;
                        case 2:
                            System.out.println("Nhập tên: ");
                            String name = scanner.nextLine();
                            customer.setName(name);
                            break;
                        case 3:
                            System.out.println("Nhập ngày sinh: ");
                            String dateOfBirth = scanner.nextLine();
                            customer.setDateOfBirth(dateOfBirth);
                            break;
                        case 4:
                            System.out.println("Nhập giới tính: ");
                            String gender = scanner.nextLine();
                            customer.setGender(gender);
                            break;
                        case 5:
                            System.out.println("Nhập CMND: ");
                            String CMND = scanner.nextLine();
                            customer.setCMND(CMND);
                            break;
                        case 6:
                            System.out.println("Nhập Số điện thoại: ");
                            String SDT = scanner.nextLine();
                            customer.setPhoneNumber(SDT);
                            break;
                        case 7:
                            System.out.println("Nhập Email: ");
                            String email = scanner.nextLine();
                            customer.setEmail(email);
                            break;
                        case 8:
                            return;

                    }

                }while (true);
            }
        }
    }
}
