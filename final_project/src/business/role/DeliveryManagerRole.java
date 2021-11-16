/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.user.EmployeeUser;
import business.user.User;
import javax.swing.JFrame;
import javax.swing.JPanel;
import userinterface.deliveryman.DeliveryManWorkAreaJPanel;

/**
 *
 * @author yi
 */
public class DeliveryManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel panel, JFrame frame, User user) {
        return new DeliveryManWorkAreaJPanel(panel,frame,(EmployeeUser)user);
    }
    
}
