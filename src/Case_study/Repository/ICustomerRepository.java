package Case_study.Repository;

import Case_study.Model.Customer;

import java.util.List;

public interface ICustomerRepository {
    void addCustomer(Customer customer);
    List<Customer>getAll();
}
