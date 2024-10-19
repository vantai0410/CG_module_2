package controller;

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
    private IProductService productService = new ProductService();
    private ProductView productView = new ProductView();
    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. View All Products");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    //updateProduct();
                    break;
                case 3:
                    //deleteProduct();
                    break;
                case 4:
                    //viewAllProducts();
                    break;
                case 5:
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
        String name = productView.getName();
        double price = productView.getPrice();
        int quantity = productView.getQuantity();
        Product product = null;
        switch (type) {
            case 1 :
                String idBook = productView.getIdBook();
                String author = productView.getAuthor();
                String publisher = productView.getPublisher();
                product = new Book(idBook, name, price, quantity, author, publisher);
                break;
        case 2 :
                String idClothing = productView.getIdClothing();
                String size = productView.getSize();
                String color = productView.getColor();
                product = new Clothing(idClothing, name, price, quantity, size, color);
                break;
            case 3:
                String idFood = productView.getIdFood();
                String expirationDate = productView.getExpirationDate();
                product = new Food(idFood, name, price, quantity, LocalDate.parse(expirationDate));
                break;
            default:
                System.out.println("Invalid type");
                return;
        }
        if (product != null) {
            productService.addProduct(product);
        }
   }
//    private void updateProduct() {
//        String id = productView.getId();
//        addProduct();
//    }
//    private void deleteProduct() {
//        String id = productView.getId();
//        productService.deleteProduct(id);
//    }
//    private void viewAllProducts() {
//        List<Product> products = productService.getAllProducts();
//        if (products.isEmpty()) {
//            System.out.println("No products available.");
//        } else {
//            for (Product product : products) {
//                System.out.println(product);
//            }
//        }
//    }
}
