/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.user;

import business.role.Role;
import business.workqueue.WorkQueue;

/**
 *
 * @author yi
 */
public class User {
    private String username;
    private String password;
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public User(String username, String password,Role role){
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    public boolean authenticateUser(String username, String password){
        return username.equals(this.username) && password.equals(this.password);
    }
    
    @Override
    public String toString(){
        return username;
    }

}
