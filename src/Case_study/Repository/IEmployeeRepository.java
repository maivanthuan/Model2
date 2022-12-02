package Case_study.Repository;

import Case_study.Model.Employee;

import java.util.List;


public interface IEmployeeRepository {
    void addEmployee(Employee employee);
    List<Employee> getAll();
}
