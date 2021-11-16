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
import userinterface.assemblymanager.AssemblyManWorkAreaJPanel;

/**
 *
 * @author yi
 */
public class AssemblyManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel panel, JFrame frame, User user) {
        return new AssemblyManWorkAreaJPanel(panel,frame,(EmployeeUser)user);
    }
    
}
