package Case_study.Repository.impl;

import Case_study.Model.Customer;
import Case_study.Repository.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    List<Customer>customerList=new ArrayList<>();

    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customerList;
    }
}
