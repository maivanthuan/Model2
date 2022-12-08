package Case_study.Repository;

import Case_study.Model.Employee;

import java.util.List;


public interface IEmployeeRepository {
    String FILE_EMPLOYEE="src/Case_study/Data/employee.csv";
    void addEmployee(Employee employee);
    List<Employee> getAll();
    void edit(List<Employee> employeeList);
}
