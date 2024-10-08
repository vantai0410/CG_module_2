package ss8_clean_code.quan_li_khach_hang;

import java.util.Scanner;

public class CustomerView {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("=========Customer Management=============");
            System.out.println("1. Add Customer");
            System.out.println("2. Delete Customer");
            System.out.println("3. Update Customer");
            System.out.println("4. View Customer");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    customerManager.addCustomer();
                    break;
                case 2:
                    customerManager.deleteCustomer();
                    break;
                case 3:
                    customerManager.updateCustomer();
                    break;
                case 4:
                    customerManager.displayCustomers();
                    break;
                case 5:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }
}
