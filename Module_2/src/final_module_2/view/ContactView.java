package final_module_2.view;

import final_module_2.common.Validate;
import final_module_2.controller.ContactController;
import final_module_2.model.Contact;

import java.util.List;
import java.util.Scanner;

public class ContactView {

        Scanner scanner = new Scanner(System.in);
        private Contact contact;
        //private Validate validate = new Validate();

        public void showMenu() {
            System.out.println("=== Quản lý Danh bạ ===");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("0. Thoát");
        }

        public int getChoice() {
            System.out.print("Lựa chọn: ");
            return Integer.parseInt(scanner.nextLine());
        }

    public Contact getContactInfo() {
        String phoneNumber;
        do {
            System.out.print("Số điện thoại (định dạng:(xxxxxxxxxx)): ");
            phoneNumber = scanner.nextLine();
            if (!Validate.isValidPhoneNumber(phoneNumber)) {
                System.out.println("Số điện thoại không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!Validate.isValidPhoneNumber(phoneNumber));

        System.out.print("Nhóm: ");
        String group = scanner.nextLine();
        System.out.print("Họ tên: ");
        String fullName = scanner.nextLine();
        System.out.print("Giới tính: ");
        String gender = scanner.nextLine();
        System.out.print("Địa chỉ: ");
        String address = scanner.nextLine();
        System.out.print("Ngày sinh: ");
        String birthDate = scanner.nextLine();

        String email;
        do {
            System.out.print("Email: ");
            email = scanner.nextLine();
            if (!Validate.isValidEmail(email)) {
                System.out.println("Email không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!Validate.isValidEmail(email));

        return new Contact(phoneNumber, group, fullName, gender, address, birthDate, email);
    }


    public String getPhoneNumber() {
            System.out.print("Nhập số điện thoại: ");
           return scanner.nextLine();
        }

        public String getSearchQuery() {
            System.out.print("Nhập họ tên hoặc số điện thoại để tìm kiếm: ");
            return scanner.nextLine();
        }

        public void displayContacts(List<Contact> contacts) {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }

    public static void main(String[] args) {
        ContactController contactController = new ContactController();
        contactController.displayMenu();
    }
    }


