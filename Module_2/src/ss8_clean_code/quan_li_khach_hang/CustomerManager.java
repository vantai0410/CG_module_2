package ss8_clean_code.quan_li_khach_hang;

import java.util.Scanner;

public class CustomerManager {
   private CustomerList customerList = new CustomerList();
    Scanner sc = new Scanner(System.in);
    public void addCustomer() {
        System.out.println("enter id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("enter name: ");

        String name = sc.nextLine();
        System.out.println("enter address: ");
        String address = sc.nextLine();
        System.out.println("enter phone number: ");
        String phone = sc.nextLine();
        System.out.println("enter birthday: ");
        String birthday = sc.nextLine();
        Customer customer = new Customer(id, name, address, phone, birthday);
        customerList.addCustomer(customer);
    }
    public void updateCustomer() {
        System.out.println("enter id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("enter name: ");
        String name = sc.nextLine();
        System.out.println("enter address: ");
        String address = sc.nextLine();
        System.out.println("enter phone number: ");
        String phone = sc.nextLine();
        System.out.println("enter birthday: ");
        String birthday = sc.nextLine();
        customerList.updateCustomer(id, name, address, phone, birthday);
    }
    public void deleteCustomer() {
        System.out.println("enter id: ");
        int id = Integer.parseInt(sc.nextLine());
        customerList.deleteCustomer(id);
    }
    public void displayCustomers() {
        customerList.displayAllCustomers();
    }
}
