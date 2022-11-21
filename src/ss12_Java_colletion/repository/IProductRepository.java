package ss12_Java_colletion.repository;

import ss12_Java_colletion.model.Product;

import java.util.List;

public interface IProductRepository {
    void add(Product product);

    List<Product>getAll();

}
