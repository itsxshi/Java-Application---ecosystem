/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.user;

import business.customer.Customer;
import business.role.CustomerRole;
import business.role.Role;
import business.workqueue.WorkQueue;

/**
 *
 * @author yi
 */
public class CustomerUser extends User{
    
    private WorkQueue workQ;
     private String customerFirstName;
    private String customerLastName;
    private String customerPhoneNum;
    private String customerEmail;
    private String customerAddress;
    private String customerZip;
    
    
    public CustomerUser(String username, String password){
        super(username, password, new CustomerRole());
        this.workQ = new WorkQueue();
    }

    public WorkQueue getWorkQ() {
        return workQ;
    }

    public void setWorkQ(WorkQueue workQ) {
        this.workQ = workQ;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerPhoneNum() {
        return customerPhoneNum;
    }

    public void setCustomerPhoneNum(String customerPhoneNum) {
        this.customerPhoneNum = customerPhoneNum;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerZip() {
        return customerZip;
    }

    public void setCustomerZip(String customerZip) {
        this.customerZip = customerZip;
    }
    
    
}
