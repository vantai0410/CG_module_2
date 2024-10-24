package final_module_2.repository;

import final_module_2.model.Contact;

import java.util.List;

public interface IContactRepository {
    List<Contact> readFromFile();
    void writeToFile(List<Contact> contacts);
}
