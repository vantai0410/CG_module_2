package service;

import model.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);
    void updateProduct(String id, Product updatedProduct);
    void deleteProduct(String id);
    List<Product> getAllProducts();
    Product searchProductById(String id);

}
