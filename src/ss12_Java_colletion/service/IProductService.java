package ss12_Java_colletion.service;

import ss12_Java_colletion.model.Product;

public interface IProductService {
    void add();
    void display();
    void change(String id);
    void sortt();
    void sortg();
    void removeProduct();
    void search(String name);

}
