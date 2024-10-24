package final_module_2.controller;

import final_module_2.model.Contact;
import final_module_2.service.ContactService;
import final_module_2.service.IContactService;
import final_module_2.view.ContactView;

import java.util.List;

public class ContactController {
    private IContactService contactService = new ContactService();
    private ContactView contactView = new ContactView();
    public void displayMenu() {
        contactView.showMenu();
        while (true) {
            int choice = contactView.getChoice();
            switch (choice) {
                case 1:
                    List<Contact> contacts = contactService.getAllContacts();
                    contactView.displayContacts(contacts);
                    break;
                case 2:
                    Contact newContact = contactView.getContactInfo();
                    contactService.addContact(newContact);
                    break;
                case 3:
                    String phoneNumberToUpdate = contactView.getPhoneNumber();
                    Contact updatedContact = contactView.getContactInfo();
                    contactService.updateContact(phoneNumberToUpdate, updatedContact);
                    break;
                case 4:
                    String phoneNumberToDelete = contactView.getPhoneNumber();
                    contactService.deleteContact(phoneNumberToDelete);
                    break;
                case 5:
                    String phoneNumber = contactView.getPhoneNumber();
                    List<Contact> foundContacts = contactService.searchByPhoneNumber(phoneNumber);
                    contactView.displayContacts(foundContacts);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
