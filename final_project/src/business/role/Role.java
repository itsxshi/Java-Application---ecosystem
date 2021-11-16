/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.ecosystem.EcoSystem;
import business.user.User;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author yi
 */
public abstract class Role {
    public abstract JPanel createWorkArea(JPanel panel,JFrame frame,User user);
}
