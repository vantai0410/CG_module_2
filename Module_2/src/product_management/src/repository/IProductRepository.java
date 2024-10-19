package repository;

import model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> readFromFile();
    void saveProducts(List<Product> products);
}
