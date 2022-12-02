package Case_study.Repository.impl;

import Case_study.Model.Employee;
import Case_study.Repository.IEmployeeRepository;
import Case_study.Service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public List<Employee> getAll() {

        return employeeList;
    }
    public static List<Employee>employeeList=new ArrayList<>();
}
