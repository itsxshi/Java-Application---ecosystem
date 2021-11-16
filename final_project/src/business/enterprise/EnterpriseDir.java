/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import java.util.ArrayList;

/**
 *
 * @author yi
 */
public class EnterpriseDir {
    private ArrayList<Enterprise> enterpriseDir;
    
    public EnterpriseDir(){
        enterpriseDir = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseDir() {
        return enterpriseDir;
    }

    public void setEnterpriseDir(ArrayList<Enterprise> enterpriseDir) {
        this.enterpriseDir = enterpriseDir;
    }
    
    public Enterprise createDeliveryCompany(String name,String address, String phone){
        Enterprise e = new DeliveryCompany(name,Enterprise.type.DeliveryCompany,address,phone);
        enterpriseDir.add(e);
        return e;
    }
    
    public Enterprise createAssemblyCompany(String name,String address, String phone){
        Enterprise e = new AssemblyCompany(name,Enterprise.type.AssemblyCompany,address,phone);
        enterpriseDir.add(e);
        return e;
    }
    
    public Enterprise createWarehouseCompany(String name,String address, String phone){
        Enterprise e = new WarehouseCompany(name,Enterprise.type.WarehouseCompany,address,phone);
        enterpriseDir.add(e);
        return e;
    }
}
