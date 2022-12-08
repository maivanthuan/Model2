package Case_study.Repository.impl;

import Case_study.Model.Employee;
import Case_study.ReadAndWrite.ReadAndWriteEmployee;
import Case_study.Repository.IEmployeeRepository;
import Case_study.Service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    ReadAndWriteEmployee readAndWriteEmployee=new ReadAndWriteEmployee();
    List<Employee>employeeList=readAndWriteEmployee.readFileEmployee(FILE_EMPLOYEE);
    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
        readAndWriteEmployee.writeFileEmployee(FILE_EMPLOYEE, employeeList);
    }

    @Override
    public List<Employee> getAll() {

        return employeeList;
    }

    @Override
    public void edit(List<Employee> employeeList) {
        readAndWriteEmployee.writeFileEmployee(FILE_EMPLOYEE,employeeList);
    }

}
