package final_module_2.service;

import final_module_2.model.Contact;
import final_module_2.repository.ContactRepository;

import java.util.ArrayList;
import java.util.List;

public class ContactService implements IContactService {
    ContactRepository contactRepository = new ContactRepository();
    List<Contact> contacts = contactRepository.readFromFile();

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.readFromFile();
    }

    @Override
    public void addContact(Contact contact) {
        List<Contact> contacts = contactRepository.readFromFile();
        contacts.add(contact);
        contactRepository.writeToFile(contacts);
    }

    @Override
    public void updateContact(String phoneNumber, Contact updatedContact) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                contact.setPhoneNumber(updatedContact.getPhoneNumber());
                contact.setGroup(updatedContact.getGroup());
                contact.setFullName(updatedContact.getFullName());
                contact.setGender(updatedContact.getGender());
                contact.setAddress(updatedContact.getAddress());
                contact.setBirthDate(updatedContact.getBirthDate());
                contact.setEmail(updatedContact.getEmail());

                contactRepository.writeToFile(contacts);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy danh bạ với số điện thoại: " + phoneNumber);
        }
    }

    @Override
    public void deleteContact(String phoneNumber) {
        boolean removed = contacts.removeIf(contact -> contact.getPhoneNumber().equals(phoneNumber));

        if (removed) {
            System.out.println("Danh bạ đã được xóa thành công.");
            contactRepository.writeToFile(contacts);
        } else {
            System.out.println("Không tìm thấy danh bạ với số điện thoại: " + phoneNumber);
        }

    }

    @Override
    public List<Contact> searchByPhoneNumber(String phoneNumber) {
        boolean found = false;
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                contacts.remove(i);
                contactRepository.writeToFile(contacts);
                System.out.println("Danh bạ đã được xóa thành công.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy danh bạ với số điện thoại: " + phoneNumber);
        }
        return contacts;
    }

    @Override
    public List<Contact> searchByName(String name) {
        List<Contact> results = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getFullName().contains(name)) {
                results.add(contact);
            }
        }
        return results;
    }


}

