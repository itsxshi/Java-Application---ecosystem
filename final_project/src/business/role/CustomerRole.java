/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.ecosystem.EcoSystem;
import business.user.CustomerUser;
import business.user.User;
import javax.swing.JFrame;
import javax.swing.JPanel;
import userinterface.customer.CustomerPanel;

/**
 *
 * @author yi
 */
public class CustomerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel panel, JFrame frame, User user) {
       return new CustomerPanel((CustomerUser) user,panel, frame);
    }
    
}
