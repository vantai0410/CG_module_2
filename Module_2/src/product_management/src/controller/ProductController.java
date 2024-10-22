package controller;

import common.Validate;
import model.Book;
import model.Clothing;
import model.Food;
import model.Product;
import service.IProductService;
import service.ProductService;
import productView.ProductView;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    private Validate validate = new Validate();
    private IProductService productService = new ProductService();
    private ProductView productView = new ProductView();
    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Search Product by ID");
            System.out.println("5. View All Products");
            System.out.println("6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    searchProduct();
                    break;
                case 5:
                    viewAllProducts();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    private void addProduct() {
        int type = productView.selectionProductType();
        String productType = (type == 1) ? "Book" : (type == 2) ? "Clothing" : "Food";
        String id = productView.getId(productType);
        String name = productView.getName();
        double price = productView.getPrice();
        int quantity = productView.getQuantity();
        Product product = null;
        switch (type) {
            case 1:
                String author = productView.getAuthor();
                String publisher = productView.getPublisher();
                product = new Book(id, name, price, quantity, author, publisher);
                break;
            case 2:

                String size = productView.getSize();
                String color = productView.getColor();
                product = new Clothing(id, name, price, quantity, size, color);
                break;
            case 3:
                String expirationDate = productView.getExpirationDate();
                product = new Food(id, name, price, quantity, LocalDate.parse(expirationDate));
                break;
            default:
                System.out.println("Invalid type");
                return;
        }
        if (product != null && validate.validateProduct(product)) {
            productService.addProduct(product);
            System.out.println("add success");
        }
    }

    private void updateProduct() {
        System.out.println("Enter the ID of the product you want to update: ");
        String id = scanner.nextLine();
        List<Product> products = productService.getAllProducts();
        Product product = null;
        for (Product p : products) {
            if (p.getId().equals(id)) {
                product = p;
                break;
            }
        }
        if (product == null) {
            System.out.println("Product not found");
            return;
        }
        System.out.println("Update product" + product);
        String newName = productView.getName();
        double newPrice = productView.getPrice();
        int newQuantity = productView.getQuantity();
        product.setName(newName);
        product.setPrice(newPrice);
        product.setQuantity(newQuantity);
        if (product instanceof Book) {
            Book book = (Book) product;
            String newAuthor = productView.getAuthor();
            if (newAuthor != null) {
                book.setAuthor(newAuthor);
            }

            String newPublisher = productView.getPublisher();
            if (newPublisher != null) {
                book.setPublisher(newPublisher);
            }
        } else if (product instanceof Clothing) {
            Clothing clothing = (Clothing) product;
            String newSize = productView.getSize();
            if (newSize != null) {
                clothing.setSize(newSize);
            }

            String newColor = productView.getColor();
            if (newColor != null) {
                clothing.setColor(newColor);
            }
        } else if (product instanceof Food) {
            Food food = (Food) product;
            String newExpirationDate = productView.getExpirationDate();
            if (newExpirationDate != null) {
                food.setExpirationDate(LocalDate.parse(newExpirationDate));
            }
        }
        productService.updateProduct(id, product);
        System.out.println("update success");
    }

    private void deleteProduct() {
        System.out.print("Enter the ID of the product you want to delete: ");
        String id = scanner.nextLine();
        productService.deleteProduct(id);
        System.out.println("delete success");
    }

    private void viewAllProducts() {
        List<Product> products = productService.getAllProducts();
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    private void searchProduct() {
        System.out.print("Enter the product ID: ");
        String id = scanner.nextLine().trim();
        Product foundProduct = productService.searchProductById(id);
        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct);
        } else {
            System.out.println("Product not found");
        }
    }
}
