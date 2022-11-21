package ss12_Java_colletion.service;

import ss12_Java_colletion.model.Product;
import ss12_Java_colletion.repository.IProductRepository;
import ss12_Java_colletion.repository.ProductRepository;
import ss7_abstack_interface.bai_tap.Colorable.Colorable;

import java.util.*;

public class ProductService implements IProductService {
    IProductRepository iProductRepository = new ProductRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        Product product = this.infor();
        iProductRepository.add(product);
    }

    @Override
    public void display() {
        List<Product> productList = iProductRepository.getAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void change(String id) {
        List<Product> productList = iProductRepository.getAll();
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                do {
                    System.out.println("1.Sửa mã");
                    System.out.println("2.Sửa tên");
                    System.out.println("3.Sửa nhà sản xuất");
                    System.out.println("4.Sửa giá tiền");
                    System.out.println("5.Quay lại");
                    System.out.println("Mời chọn: ");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            System.out.println("Nhập mã mới: ");
                            String newid = scanner.nextLine();
                            product.setId(newid);
                            System.out.println("Sửa thành công");
                            break;
                        case 2:
                            System.out.println("Nhập tên mới: ");
                            String newname = scanner.nextLine();
                            product.setName(newname);
                            System.out.println("Sửa thành công");
                            break;
                        case 3:
                            System.out.println("Nhập nhà sản xuất mới: ");
                            String newmanu = scanner.nextLine();
                            product.setManufacturer(newmanu);
                            System.out.println("Sửa thành công");
                            break;
                        case 4:
                            System.out.println("Nhập giá mới: ");
                            double newprice = Double.parseDouble(scanner.nextLine());
                            product.setPrice(newprice);
                            System.out.println("Sửa thành công");
                            break;
                        case 5:
                            return;
                    }

                } while (true);


            }
        }
    }

    @Override
    public void sortt() {
        List<Product> productList = iProductRepository.getAll();
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void sortg() {
        List<Product> productList = iProductRepository.getAll();
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        });
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void removeProduct() {
        List<Product> productList = iProductRepository.getAll();
        String remove = scanner.nextLine();
        for (int index = 0; index < productList.size(); index++) {
            if (remove.equals(productList.get(index).getId())) {
                productList.remove(index);
            }
        }
    }

    @Override
    public void search(String name) {
        List<Product> productList = iProductRepository.getAll();
        for (Product product1 : productList) {
            if (product1.getName().contains(name)) {
                System.out.println(product1);
            }
        }
    }

    public Product infor() {
        System.out.println("Nhập mã sản phẩm: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập nhà sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.println("Nhập giá tiền: ");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, manufacturer, price);
        return product;
    }
}
