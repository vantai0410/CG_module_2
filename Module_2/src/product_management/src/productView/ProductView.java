package productView;

import common.Validate;
import controller.ProductController;
import model.Book;
import model.Product;

import java.time.LocalDate;
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
    public String getId(String productType) {
        String id;
        while (true) {
            if (productType.equals("Book")) {
                System.out.print("Enter product ID for book (e.g., B001): ");
            } else if (productType.equals("Clothing")) {
                System.out.print("Enter product ID for clothing (e.g., C001): ");
            } else if (productType.equals("Food")) {
                System.out.print("Enter product ID for food (e.g., F001): ");
            } else {
                System.out.println("Unknown product type");
                return null;
            }
            id = scanner.nextLine();
            boolean isValid = false;

            switch (productType) {
                case "Book":
                    isValid = id.matches("B\\d{3}");
                    break;
                case "Clothing":
                    isValid = id.matches("C\\d{3}");
                    break;
                case "Food":
                    isValid = id.matches("F\\d{3}");
                    break;
                default:
                    System.out.println("Unknown product type");
                    break;
            }

            if (isValid) {
                break;
            } else {
                System.out.println("Invalid ID format. Please try again.");
            }
        }
        return id;
    }

    public String getName() {
        String name;
        while (true) {
            System.out.print("Enter product name: ");
            name = scanner.nextLine();
            if (validate.validateName(name)) {
                break;
            } else {
                System.out.println("Invalid product name. Please enter a valid name (2-50 characters, no special symbols).");
            }
        }
        return name;
    }


    public double getPrice() {
        double price = 0.0;
        while (true) {
            System.out.print("Enter product price: ");
            try {
                price = Double.parseDouble(scanner.nextLine());
                if (price > 0) {
                    break;
                } else {
                    System.out.println("Price must be positive. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return price;
    }

    public int getQuantity() {
        int quantity;
        while (true) {
            try {
                System.out.print("Enter product quantity: ");
                quantity = Integer.parseInt(scanner.nextLine());
                if (quantity >= 0) {
                    break;
                } else {
                    System.out.println("Quantity must be a non-negative number. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return quantity;
    }

    public String getAuthor() {
        String author;
        while (true) {
            System.out.print("Enter author name: ");
            author = scanner.nextLine();
            if (author.length() >= 2 && author.length() <= 50) {
                break;
            } else {
                System.out.println("Author name must be between 2 and 50 characters.");
            }
        }
        return author;
    }

    public String getPublisher() {
        String publisher;
        while (true) {
            System.out.print("Enter publisher name: ");
            publisher = scanner.next();
            if (publisher.length() >= 2 && publisher.length() <= 50) {
                break;
            } else {
                System.out.println("Publisher name must be between 2 and 50 characters.");
            }
        }
        return publisher;
    }

    public String getSize() {
        String size;
        while (true) {
            System.out.print("Enter size (S, M, L, XL): ");
            size = scanner.next();
            if (size.matches("S|M|L|XL")) {
                break;
            } else {
                System.out.println("Invalid size. Please enter S, M, L, or XL.");
            }
        }
        return size;
    }
    public String getColor() {
        String color;
        while (true) {
            System.out.print("Enter color: ");
            color = scanner.nextLine();
            if (!color.isEmpty() && color.length() <= 30) {
                break;
            } else {
                System.out.println("Invalid color. Please enter a color name (max 30 characters).");
            }
        }
        return color;
    }

    public String getExpirationDate() {
        String expirationDate;
        while (true) {
            System.out.print("Enter expiration date (yyyy-MM-dd): ");
            expirationDate = scanner.nextLine();
            try {
                LocalDate.parse(expirationDate);
                break;
            } catch (Exception e) {
                System.out.println("Invalid date format. Please try again (yyyy-MM-dd).");
            }
        }
        return expirationDate;
    }

    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.showMenu();
    }
}
