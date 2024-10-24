package final_module_2.repository;

import final_module_2.model.Contact;
import ss16_io_text_file.manage_student_iofile.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContactRepository implements IContactRepository {
    private static final String PATH = "Module_2/src/final_module_2/data/contact.txt";

    @Override
    public List<Contact> readFromFile() {
        List<Contact> contacts = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }
                String[] values = line.split(",");
                if (values.length == 7) {
                    Contact contact = new Contact(values[0], values[1], values[2], values[3], values[4], values[5], values[6]);
                    contacts.add(contact);
                } else {
                    continue;
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contacts;
    }

    @Override
    public void writeToFile(List<Contact> contacts) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATH))) {
            writer.newLine();
            for (Contact contact : contacts) {
                writer.write(contact.getPhoneNumber() + "," +
                        contact.getGroup() + "," +
                        contact.getFullName() + "," +
                        contact.getGender() + "," +
                        contact.getAddress() + "," +
                        contact.getBirthDate() + "," +
                        contact.getEmail());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
