/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.employee.EmployeeDir;
import business.user.UserDir;
import java.util.UUID;

/**
 *
 * @author yi
 */
public class Organization {
    private String id;
    private Organization.Type type;
    private EmployeeDir employeeDir;
    private String name;
    private UserDir userDir;
    
    public enum Type {
        Manager,Employee;
    }
    
    public Organization (String name,Organization.Type type){
        this.name = name;
        this.type = type;
        this.employeeDir = new EmployeeDir();
        this.id = UUID.randomUUID().toString().replace("-", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EmployeeDir getEmployeeDir() {
        return employeeDir;
    }

    public void setEmployeeDir(EmployeeDir employeeDir) {
        this.employeeDir = employeeDir;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDir getUserDir() {
        return userDir;
    }

    public void setUserDir(UserDir userDir) {
        this.userDir = userDir;
    }
    
    
}
