package Case_study.Service.impl;

import Case_study.Model.Employee;
import Case_study.Model.Person;
import Case_study.ReadAndWrite.ReadAndWriteEmployee;
import Case_study.Repository.IEmployeeRepository;
import Case_study.Repository.impl.EmployeeRepository;
import Case_study.Service.IEmployeeService;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    ReadAndWriteEmployee readAndWriteEmployee=new ReadAndWriteEmployee();
    IEmployeeRepository iEmployeeRepository =new EmployeeRepository();
    Scanner scanner=new Scanner(System.in);

    @Override
    public void add() {
        Employee employee=new Employee();
            employee.inforEmployee();
            iEmployeeRepository.addEmployee(employee);

    }

    @Override
    public void display() {
        List<Employee>employeeList= iEmployeeRepository.getAll();
        for (Employee employee:employeeList){
            System.out.println(employee);
        }

    }

    @Override
    public void edit(String id) {
        List<Employee>employeeList= iEmployeeRepository.getAll();
        for (Employee employee1:employeeList) {
            if (employee1.getId().equals(id)) {
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
                            employee1.setId(code);
                            iEmployeeRepository.edit(employeeList);

                            break;
                        case 2:
                            System.out.println("Nhập tên: ");
                            String name = scanner.nextLine();
                            employee1.setName(name);
                            iEmployeeRepository.edit(employeeList);
                            break;
                        case 3:
                            System.out.println("Nhập ngày sinh: ");
                            String dateOfBirth = scanner.nextLine();
                            employee1.setDateOfBirth(dateOfBirth);
                            iEmployeeRepository.edit(employeeList);
                            break;
                        case 4:
                            System.out.println("Nhập giới tính: ");
                            String gender = scanner.nextLine();
                            employee1.setGender(gender);
                            iEmployeeRepository.edit(employeeList);
                            break;
                        case 5:
                            System.out.println("Nhập CMND: ");
                            String CMND = scanner.nextLine();
                            employee1.setCMND(CMND);
                            iEmployeeRepository.edit(employeeList);
                            break;
                        case 6:
                            System.out.println("Nhập Số điện thoại: ");
                            String SDT = scanner.nextLine();
                            employee1.setPhoneNumber(SDT);
                            iEmployeeRepository.edit(employeeList);
                            break;
                        case 7:
                            System.out.println("Nhập Email: ");
                            String email = scanner.nextLine();
                            employee1.setEmail(email);
                            iEmployeeRepository.edit(employeeList);
                            break;
                        case 8:
                            return;

                    }


                } while (true);
            }
        }
    }
}
