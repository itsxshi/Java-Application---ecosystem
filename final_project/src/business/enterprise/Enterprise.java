/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.organization.OrganizationDir;
import business.user.UserDir;
import business.workqueue.WorkQueue;
import java.util.UUID;

/**
 *
 * @author yi
 */
public class Enterprise{
    String id;
    private String name;
    private OrganizationDir organizationDir;
    private Enterprise.type type;
    private UserDir userDir;
    
    public enum type {
        AssemblyCompany,DeliveryCompany,WarehouseCompany;
    }

    public Enterprise(String name,Enterprise.type type) {
        this.id = UUID.randomUUID().toString().replace("-", "");
        this.name = name;
        this.type = type;
        this.userDir = new UserDir();
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationDir getOrganizationDir() {
        return organizationDir;
    }

    public void setOrganizationDir(OrganizationDir organizationDir) {
        this.organizationDir = organizationDir;
    }

    public type getType() {
        return type;
    }

    public void setType(type type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return name;
    }

    public UserDir getUserDir() {
        return userDir;
    }

    public void setUserDir(UserDir userDir) {
        this.userDir = userDir;
    }
    
    
    
}
