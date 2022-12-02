package Case_study.Service.impl;

import Case_study.Model.Employee;
import Case_study.Model.Person;
import Case_study.Repository.IEmployeeRepository;
import Case_study.Repository.impl.EmployeeRepository;
import Case_study.Service.IEmployeeService;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository employeeRepository=new EmployeeRepository();
    Scanner scanner=new Scanner(System.in);
    Person employee=new Employee();

    @Override
    public void add() {
        Employee employee=new Employee();
            employee.inforEmployee();
            employeeRepository.addEmployee(employee);


    }

    @Override
    public void display() {
        List<Employee>employeeList=employeeRepository.getAll();
        for (Employee employee:employeeList){
            System.out.println(employee);
        }

    }

    @Override
    public void edit(String id) {
        List<Employee>employeeList=employeeRepository.getAll();
        for (Employee employee1:employeeList) {
            if (employee1.getId().equals(id)) {
            }
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
                        employee.setId(code);
                        break;
                    case 2:
                        System.out.println("Nhập tên: ");
                        String name = scanner.nextLine();
                        employee.setName(name);
                        break;
                    case 3:
                        System.out.println("Nhập ngày sinh: ");
                        String dateOfBirth = scanner.nextLine();
                        employee.setDateOfBirth(dateOfBirth);
                        break;
                    case 4:
                        System.out.println("Nhập giới tính: ");
                        String gender = scanner.nextLine();
                        employee.setGender(gender);
                        break;
                    case 5:
                        System.out.println("Nhập CMND: ");
                        String CMND = scanner.nextLine();
                        employee.setCMND(CMND);
                        break;
                    case 6:
                        System.out.println("Nhập Số điện thoại: ");
                        String SDT = scanner.nextLine();
                        employee.setPhoneNumber(SDT);
                        break;
                    case 7:
                        System.out.println("Nhập Email: ");
                        String email = scanner.nextLine();
                        employee.setEmail(email);
                        break;
                    case 8:
                        return;

                }


            } while (true);
        }
    }
}
