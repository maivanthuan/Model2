package ss12_Java_colletion.repository;

import ss12_Java_colletion.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
   public static List<Product>productList=new ArrayList<>();
    static {
       productList.add(new Product("10","iphone 11","apple",100000000));
        productList.add(new Product("11","iphone 12","apple",10000000));
        productList.add(new Product("12","iphone 16","apple",2000000));
        productList.add(new Product("13","samsung untra","samsung",1200000));
        productList.add(new Product("14","vivo","trung quoc",1000));
    }

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public List<Product> getAll() {
        return productList;
    }
}
