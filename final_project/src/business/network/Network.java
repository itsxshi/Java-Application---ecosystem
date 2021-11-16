/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.network;

import business.enterprise.DeliveryCompany;
import business.enterprise.Enterprise;
import business.enterprise.EnterpriseDir;
import business.enterprise.WarehouseCompany;
import business.furniture.FurnitureDir;
import business.workqueue.WorkQueue;

/**
 *
 * @author yi
 */
public class Network {
    private String name;
    private EnterpriseDir enterpriseDirectory;
    private FurnitureDir furnitureDir;
    private WorkQueue workqueue;
    
    public Network(String name){
        this.name = name;
        this.enterpriseDirectory = new EnterpriseDir();
        this.workqueue = new WorkQueue();
        this.furnitureDir = new FurnitureDir();
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDir getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDir enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }

    public FurnitureDir getFurnitureDir() {
        return furnitureDir;
    }

    public void setFurnitureDir(FurnitureDir furnitureDir) {
        this.furnitureDir = furnitureDir;
    }
    
    public Enterprise createDeliveryCompany(String name,String address, String phone){
       return this.enterpriseDirectory.createDeliveryCompany(name, address, phone);
    }
    
    public Enterprise createAssemblyCompany(String name,String address, String phone){
        return this.enterpriseDirectory.createAssemblyCompany(name, address, phone);
    }
    
    public Enterprise createWarehouseCompany(String name,String address, String phone){
        return this.enterpriseDirectory.createWarehouseCompany(name, address, phone);
    }
    
    public DeliveryCompany getFirstDelivery(){
        for (Enterprise e:this.enterpriseDirectory.getEnterpriseDir()){
            if (e instanceof DeliveryCompany){
                return (DeliveryCompany)e;
            }
        }
        return null;
    }
    
    public Enterprise getWarehouseById(String id){
        for (Enterprise e : this.enterpriseDirectory.getEnterpriseDir()){
            if (e instanceof WarehouseCompany && e.getId().equals(id)){
                return e;
            }
        }
        return null;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
