package Case_study.Service;

public interface ICustomerService extends IService{
    @Override
    void add();

    @Override
    void display();
    void edit(String id);
}
