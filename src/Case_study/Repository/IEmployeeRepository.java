package Case_study.Repository;

import Case_study.Model.Employee;

import java.awt.*;

public interface EmployeeRepository {
    void addEmployee(Employee employee);
    List<Employee>getAll();
}
