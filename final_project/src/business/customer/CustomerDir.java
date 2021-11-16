/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.customer;

import business.user.CustomerUser;
import java.util.ArrayList;

/**
 *
 * @author yi
 */
public class CustomerDir {

    private ArrayList<Customer> customerDir;

    public CustomerDir() {
        this.customerDir = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerDir() {
        return customerDir;
    }

    public void setCustomerDir(ArrayList<Customer> customerDir) {
        this.customerDir = customerDir;
    }

    public Customer addCustomer(String customerFirstName, String customerLastName, String customerPhoneNum, String customerEmail,
            String customerAddress, String customerZip, CustomerUser cUser) {
        Customer c = new Customer(customerFirstName, customerLastName, customerPhoneNum, customerEmail, customerAddress, customerZip, cUser);
        customerDir.add(c);
        return c;
    }

    public void removeCustomer(Customer c) {
        for (Customer tc : customerDir){
            if (tc.getCustomerUser().getUsername().equals(c.getCustomerUser().getUsername())){
                customerDir.remove(tc);
                return;
            }
        }
    }
}
