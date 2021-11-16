/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.customer;

import business.user.CustomerUser;
import business.workqueue.WorkQueue;

/**
 *
 * @author keihouZZ
 */
public class Customer {

    private int customerId;
    private String customerFirstName;
    private String customerLastName;
    private String customerPhoneNum;
    private String customerEmail;
    private String customerAddress;
    private String customerZip;
    private CustomerUser customerUser;

    public Customer(String customerFirstName, String customerLastName, String customerPhoneNum, String customerEmail,
            String customerAddress, String customerZip,CustomerUser customerUser) {
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerPhoneNum = customerPhoneNum;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.customerZip = customerZip;
        this.customerUser = customerUser;
    }

    public CustomerUser getCustomerUser() {
        return customerUser;
    }

    public void setCustomerUser(CustomerUser customerUser) {
        this.customerUser = customerUser;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    @Override
    public String toString(){
        return this.customerLastName;
    }
}
