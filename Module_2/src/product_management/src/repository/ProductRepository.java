package repository;

import model.Book;
import model.Clothing;
import model.Food;
import model.Product;

import java.io.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String PATH = "src/data/product.csv";

    @Override
    public List<Product> readFromFile() {
        List<Product> products = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                String type = data[0].trim();
                String id = data[1].trim();
                String name = data[2].trim();
                double price = Double.parseDouble(data[3].trim());
                int quantity = Integer.parseInt(data[4].trim());
                switch (type) {
                    case "Book":
                        String author = data[5].trim();
                        String publisher = data[6].trim();
                        products.add(new Book(id, name, price, quantity, author, publisher));
                        break;
                    case "Clothing":
                        String size = data[5].trim();
                        String color = data[6].trim();
                        products.add(new Clothing(id, name, price, quantity, size, color));
                        break;
                    case "Food":
                        LocalDate expirationDate = LocalDate.parse(data[5].trim());
                        products.add(new Food(id, name, price, quantity, expirationDate));
                        break;
                    default:
                        System.out.println("Unknown product type: " + type);
                        break;
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public void saveProducts(List<Product> products) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH))) {
            for (Product product : products) {
                String type = product.getProductType();
                bufferedWriter.write(type + "," + product.getId() + "," + product.getName() + "," +
                        product.getPrice() + "," + product.getQuantity());

                if (product instanceof Book) {
                    Book book = (Book) product;
                    bufferedWriter.write("," + book.getAuthor() + "," + book.getPublisher());
                } else if (product instanceof Clothing) {
                    Clothing clothing = (Clothing) product;
                    bufferedWriter.write("," + clothing.getSize() + "," + clothing.getColor());
                } else if (product instanceof Food) {
                    Food food = (Food) product;
                    bufferedWriter.write("," + food.getExpirationDate());
                }

                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
