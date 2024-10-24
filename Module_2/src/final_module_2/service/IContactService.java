package final_module_2.service;

import final_module_2.model.Contact;

import java.util.List;

public interface IContactService {
    List<Contact> getAllContacts();
    void addContact(Contact contact);
    void updateContact(String phoneNumber, Contact updatedContact);
    void deleteContact(String phoneNumber);
    List<Contact> searchByPhoneNumber(String phoneNumber);
    List<Contact> searchByName(String name);
}
