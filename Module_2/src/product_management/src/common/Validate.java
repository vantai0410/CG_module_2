package common;

import model.Book;
import model.Clothing;
import model.Food;
import model.Product;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    Scanner scanner = new Scanner(System.in);
    //private static final String ID_PATTERN = "^[A-Za-z0-9 ]{1,50}$";
    private static final String NAME_PATTERN = "^[A-Za-z0-9 ]{2,50}$";
//    public String validateId(){
//        String id;
//        while (true) {
//            System.out.print("Enter product ID (e.g., B001): ");
//            id = scanner.next();
//            if (Pattern.matches(ID_PATTERN, id)) {
//                break;
//            } else {
//                System.out.println("Invalid ID format. Please try again.");
//            }
//        }
//        return id;
//    }

    public boolean validateName(String name) {
        return Pattern.matches(NAME_PATTERN, name);
    }



    public boolean validateProduct(Product product) {
        String productType = product.getProductType(); 
        switch (productType) {
            case "Book":
                return validateBook((Book) product);
            case "Clothing":
                return validateClothing((Clothing) product);
            case "Food":
                return validateFood((Food) product);
            default:
                System.out.println("Unknown product type");
                return false;
        }

    }
    public boolean validateBook(Book book){
        String idPattern = "B\\d{3}";
        String textPattern = ".+";

        return book.getId().matches(idPattern) &&
                book.getAuthor().matches(textPattern) &&
                book.getPublisher().matches(textPattern);
    }
    public boolean validateFood(Food food){
        String idPattern = "F\\d{3}";
//        String textPattern = ".+";
        return food.getId().matches(idPattern);
    }
    public boolean validateClothing(Clothing clothing){
        String idPattern = "C\\d{3}";
        String textPattern = ".+";

        return clothing.getId().matches(idPattern) &&
                clothing.getSize().matches(textPattern) &&
                clothing.getColor().matches(textPattern);
    }
}
