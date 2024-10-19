package common;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    Scanner scanner = new Scanner(System.in);

    private static final String NAME_PATTERN = "^[A-Za-z0-9 ]{2,50}$";
    public String validateIdFood() {
        final String ID_PATTERN = "^[F0-9 ]{1,50}$";
        String id;
        while (true) {
            System.out.print("Enter product ID (e.g., F001): ");
            id = scanner.next();
            if (Pattern.matches(ID_PATTERN, id)) {
                break;
            } else {
                System.out.println("Invalid ID format. Please try again.");
            }
        }
        return id;
    }
    public String validateIdBook() {
        final String ID_PATTERN = "^[B0-9 ]{1,50}$";
        String id;
        while (true) {
            System.out.print("Enter product ID (e.g., B001): ");
            id = scanner.next();
            if (Pattern.matches(ID_PATTERN, id)) {
                break;
            } else {
                System.out.println("Invalid ID format. Please try again.");
            }
        }
        return id;
    }
    public String validateIdClothing() {
        final String ID_PATTERN = "^[C0-9 ]{1,50}$";
        String id;
        while (true) {
            System.out.print("Enter product ID (e.g., C001): ");
            id = scanner.next();
            if (Pattern.matches(ID_PATTERN, id)) {
                break;
            } else {
                System.out.println("Invalid ID format. Please try again.");
            }
        }
        return id;
    }

    public String validateName() {
        String name;
        while (true) {
            System.out.print("Enter product name: ");
            name = scanner.next();
            if (Pattern.matches(NAME_PATTERN, name)) {
                break;
            } else {
                System.out.println("Invalid product name. Please enter a valid name (2-50 characters, no special symbols).");
            }
        }
        return name;
    }

    public double validatePrice() {
        double price;
        while (true) {
            System.out.print("Enter product price: ");
            price = scanner.nextDouble();
            if (price > 0) {
                break;
            } else {
                System.out.println("Price must be positive. Please try again.");
            }
        }
        return price;
    }

    public int validateQuantity() {
        int quantity;
        while (true) {
            System.out.print("Enter product quantity: ");
            quantity = scanner.nextInt();
            if (quantity >= 0) {
                break;
            } else {
                System.out.println("Quantity must be a non-negative number. Please try again.");
            }
        }
        return quantity;
    }

    public String validateAuthor() {
        String author;
        while (true) {
            System.out.print("Enter author name: ");
            author = scanner.next();
            if (author.length() >= 2 && author.length() <= 50) {
                break;
            } else {
                System.out.println("Author name must be between 2 and 50 characters.");
            }
        }
        return author;
    }

    public String validatePublisher() {
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

    public String validateSize() {
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

    public String validateColor() {
        String color;
        while (true) {
            System.out.print("Enter color: ");
            color = scanner.next();
            if (color.length() >= 2 && color.length() <= 20) {
                break;
            } else {
                System.out.println("Color must be between 2 and 20 characters.");
            }
        }
        return color;
    }

    public String validateExpirationDate() {
        String expirationDate;
        while (true) {
            System.out.print("Enter expiration date (YYYY-MM-DD): ");
            expirationDate = scanner.next();
            if (expirationDate.matches("\\d{4}-\\d{2}-\\d{2}")) {
                break;
            } else {
                System.out.println("Invalid date format. Please enter in the format YYYY-MM-DD.");
            }
        }
        return expirationDate;
    }
}
