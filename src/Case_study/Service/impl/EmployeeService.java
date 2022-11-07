package Case_study.Service.impl;

import Case_study.Model.Employee;
import Case_study.Service.IEmployeeService;

import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Scanner scanner=new Scanner(System.in);

    @Override
    public void add() {
        Employee employee=new Employee();
            employee.inforEmployee();
            

    }

    @Override
    public void display() {

    }

    @Override
    public void edit(int id) {

    }
}
