package ss8_clean_code.quan_li_khach_hang;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
    private List<Customer> customerList = new ArrayList<>();
    public void addCustomer(Customer customer) {
        for (Customer c : customerList) {
            if(c.getId() == customer.getId()) {
                System.out.println("customer already exist");
                return;
            }
        }
        customerList.add(customer);
        System.out.println("add customer success");
    }
    public void deleteCustomer(int id) {
        boolean found = false;
        for (Customer c : customerList) {
            if(c.getId() == id) {
                customerList.remove(c);
                found = true;
                System.out.println("delete customer success");
                break;
            }
        }
        if(!found) {
            System.out.println("customer not found");
        }
    }
    public void updateCustomer(int id, String name, String adress, String phone, String birthDay ){
        boolean found = false;
        for (Customer c : customerList) {
            if(c.getId() == id) {
                found = true;
                if(!name.isEmpty()){
                    c.setName(name);
                }
                if(!adress.isEmpty()){
                    c.setAdress(adress);
                }
                if(!phone.isEmpty()){
                    c.setPhone(phone);
                }
                if(!birthDay.isEmpty()){
                    c.setBirthDay(birthDay);
                }
                System.out.println("update customer success");
                break;
            }
        }
        if(!found) {
            System.out.println("customer not found");
        }
    }
    public void displayAllCustomers() {
        if(customerList.isEmpty()) {
            System.out.println("customers list is empty");
        } else {
            for (Customer c : customerList) {
                System.out.println(c);
            }
        }
    }
}
