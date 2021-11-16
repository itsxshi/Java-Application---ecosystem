/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

/**
 *
 * @author yi
 */
public class WarehouseCompany extends Enterprise{
    private String address;
    private String phone;
    
    public WarehouseCompany(String name, Enterprise.type type, String address, String phone){
        super(name,type);
        this.address = address;
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
}
