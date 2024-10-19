package service;

import common.Validate;
import model.Product;
import repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    ProductRepository repository = new ProductRepository();
    Validate validate = new Validate();
    @Override
    public void addProduct(Product product) {
        List<Product> products = repository.readFromFile();
        products.add(product);
        repository.saveProducts(products);
    }

    @Override
    public void updateProduct(String id, Product updatedProduct) {
        List<Product> products = repository.readFromFile();
        for (Product product : products) {
            if (product.getId().equals(id)) {
                if(product.getName() != null && !product.getName().isEmpty()) {
                    product.setName(updatedProduct.getName());
                }
                product.setPrice(updatedProduct.getPrice());
                product.setQuantity(updatedProduct.getQuantity());
            }
        }
        repository.saveProducts(products);
    }

    @Override
    public void deleteProduct(String id) {
        List<Product> products = repository.readFromFile();
        for (Product product : products) {
            if (product.getId().equals(id)) {
                products.remove(product);
            }
        }
        repository.saveProducts(products);
    }

    @Override
    public List<Product> getAllProducts() {
        return repository.readFromFile();
    }
}
