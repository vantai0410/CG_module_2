package productView;

import common.Validate;
import controller.ProductController;

import java.util.Scanner;

public class ProductView {
    Validate validate = new Validate();
    Scanner scanner = new Scanner(System.in);
    public int selectionProductType(){
        System.out.println("Select Product Type: 1. Books, 2. Clothing, 3. Food");
        int choice;
        while(true){
            try{
                choice = Integer.parseInt(scanner.nextLine());
                if(choice >= 1 && choice <= 3){
                    break;
                } else {
                    System.out.println("invalid choice, enter again");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice, enter again");
            }
        }
        return choice;
    }
    public String getIdBook() {
        return validate.validateIdBook();
    }
    public String getIdClothing() {
        return validate.validateIdClothing();
    }
    public String getIdFood() {
        return validate.validateIdFood();
    }
    public String getName() {
        return validate.validateName();
    }

    public double getPrice() {
        return validate.validatePrice();
    }

    public int getQuantity() {
        return validate.validateQuantity();
    }

    public String getAuthor() {
        return validate.validateAuthor();
    }

    public String getPublisher() {
        return validate.validatePublisher();
    }

    public String getSize() {
        return validate.validateSize();
    }

    public String getColor() {
        return validate.validateColor();
    }

    public String getExpirationDate() {
        return validate.validateExpirationDate();
    }

    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.showMenu();
    }
}
