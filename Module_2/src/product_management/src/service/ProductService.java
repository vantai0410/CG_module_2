package service;

import common.Validate;
import model.Product;
import repository.ProductRepository;

import java.util.Iterator;
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
                if (updatedProduct.getName() != null && !updatedProduct.getName().isEmpty()) {
                    product.setName(updatedProduct.getName());
                }

                if (updatedProduct.getPrice() != 0) {
                    product.setPrice(updatedProduct.getPrice());
                }
                if (updatedProduct.getQuantity() != 0) {
                    product.setQuantity(updatedProduct.getQuantity());
                }
                }
                product.setPrice(updatedProduct.getPrice());
                product.setQuantity(updatedProduct.getQuantity());
            }
        repository.saveProducts(products);
    }

    @Override
    public void deleteProduct(String id) {
        List<Product> products = repository.readFromFile();
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId().equals(id)) {
                iterator.remove();
                System.out.println("Product with ID: " + id + " has been deleted.");
            }
        }
        repository.saveProducts(products);
    }

    @Override
    public List<Product> getAllProducts() {
        return repository.readFromFile();
    }

    @Override
    public Product searchProductById(String id) {
        List<Product> products = repository.readFromFile();
        for (Product product : products) {
            if (product.getId().equalsIgnoreCase(id)) {
                return product;
            }
        }
        return null;
    }

}
