package repository;

import model.Book;
import model.Clothing;
import model.Food;
import model.Product;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String PATH = "src/data/product.csv";

    @Override
    public List<Product> readFromFile() {
        List<Product> products = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                String type = data[0];
                if (type.equals("Books")) {
                    products.add(new Book(data[1], data[2], Double.parseDouble(data[3]), Integer.parseInt(data[4]), data[5], data[6]));
                } else if (type.equals("Clothing")) {
                    products.add(new Clothing(data[1], data[2], Double.parseDouble(data[3]), Integer.parseInt(data[4]), data[5], data[6]));
                } else if (type.equals("Food")) {
                    products.add(new Food(data[1], data[2], Double.parseDouble(data[3]), Integer.parseInt(data[4]), LocalDate.parse(data[5])));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public void saveProducts(List<Product> products) {
        try (FileWriter fileWriter = new FileWriter(PATH);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (Product product : products) {
                String type = product.getProductType();
                bufferedWriter.write(type + "," + product.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
