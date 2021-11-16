/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.user;

import business.role.Role;
import business.role.SystemManagerRole;
import java.util.ArrayList;

/**
 *
 * @author yi
 */
public class UserDir {

    private ArrayList<User> userDir;

    public UserDir() {
        userDir = new ArrayList<>();
    }

    public ArrayList<User> getUserDir() {
        return userDir;
    }

    public User createUser(String username, String password, Role role) {
        User user = new User(username, password, role);
        this.userDir.add(user);
        return user;
    }

    public User createSysUser(String username, String password, String firstName, String lastName, String phoneNum, String email, String address, String zip) {
        User user = new SystemUser(username, password, new SystemManagerRole(), firstName, lastName, phoneNum, email, address, zip);
        this.userDir.add(user);
        return user;
    }
    
    public User createEmployeeUser(String username, String password,String firstName, String lastName, String phoneNum, String email, String address, String zip, Role role) {
        User user = new EmployeeUser(username, password, firstName, lastName, phoneNum, email, address, zip, role);
        this.userDir.add(user);
        return user;
    }

    public User authenticateUser(String username, String password) {
        for (User ua : userDir) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

}
