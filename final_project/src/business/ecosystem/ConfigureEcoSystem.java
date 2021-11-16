/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.ecosystem;

import business.enterprise.AssemblyCompany;
import business.enterprise.DeliveryCompany;
import business.enterprise.WarehouseCompany;
import business.furniture.Furniture;
import business.network.Network;
import business.role.AssemblyManagerRole;
import business.role.DeliveryManagerRole;
import business.role.SystemManagerRole;
import business.role.WarehouseManagerRole;
import business.user.CustomerUser;
import business.user.User;

/**
 *
 * @author yi
 */
public class ConfigureEcoSystem {

    public static EcoSystem configure() {
        // TODO 
        // ecosystem initliazation
        EcoSystem system = EcoSystem.getInstance();

        User sysUser = system.getUserDir().createSysUser("sysadmin", "sysadmin", "ss", "ss", "123", "123@123.com", "11111", "123123");

        system.getCustomerDir().addCustomer("XX", "YY", "123", "123@123.com", "11111", "123123", new CustomerUser("c1", "c1"));
        system.getCustomerDir().addCustomer("yy", "xx", "123", "123@123.com", "11111", "123123", new CustomerUser("c2", "c2"));

        Network boston = system.createAndAddNetwork("Boston");
        AssemblyCompany bac = (AssemblyCompany) boston.createAssemblyCompany("Assembly Company", "Assembly Company Address", "0123456789");
        bac.getUserDir().createEmployeeUser("bac1", "bac1", "ss", "ss", "123", "123@123.com", "11111", "123123", new AssemblyManagerRole());
        DeliveryCompany bdc = (DeliveryCompany) boston.createDeliveryCompany("Delivery Company", "Delivery Company Address", "0123456789");
        bdc.getUserDir().createEmployeeUser("bdc1", "bdc1", "ss", "ss", "123", "123@123.com", "11111", "123123", new DeliveryManagerRole());
        WarehouseCompany bwarehouse = (WarehouseCompany) boston.createWarehouseCompany("Warehouse Company", "Warehouse Company Address", "0123456789");
        WarehouseCompany bwarehouse2 = (WarehouseCompany) boston.createWarehouseCompany("Warehouse Company2", "Warehouse Company Address2", "0123456789");
        bwarehouse.getUserDir().createEmployeeUser("bw1", "bw1", "ss", "ss", "123", "123@123.com", "11111", "123123", new WarehouseManagerRole());
        bwarehouse2.getUserDir().createEmployeeUser("bw2", "bw2", "ss", "ss", "123", "123@123.com", "11111", "123123", new WarehouseManagerRole());
        boston.getFurnitureDir().addFurniture("chair", "newChair", Furniture.category.chair, 4.99, 2, sysUser, bwarehouse);
        boston.getFurnitureDir().addFurniture("bookcase", "Oldddd", Furniture.category.bookcase, 3.99, 1, sysUser, bwarehouse2);

        Network la = system.createAndAddNetwork("Los Angles");
        AssemblyCompany lac = (AssemblyCompany) la.createAssemblyCompany("Assembly Company", "Assembly Company Address", "0123456789");
        lac.getUserDir().createEmployeeUser("lac1", "lac1", "ss", "ss", "123", "123@123.com", "11111", "123123", new AssemblyManagerRole());
        DeliveryCompany ldc = (DeliveryCompany) la.createDeliveryCompany("Delivery Company", "Delivery Company Address", "0123456789");
        ldc.getUserDir().createEmployeeUser("ldc1", "ldc1", "ss", "ss", "123", "123@123.com", "11111", "123123", new DeliveryManagerRole());
        WarehouseCompany lwarehouse = (WarehouseCompany) la.createWarehouseCompany("Warehouse Company", "Warehouse Company Address", "0123456789");
        lwarehouse.getUserDir().createEmployeeUser("lw1", "lw1", "ss", "ss", "123", "123@123.com", "11111", "123123", new WarehouseManagerRole());
        la.getFurnitureDir().addFurniture("chair", "newChair", Furniture.category.chair, 3.99, 1, sysUser, lwarehouse);
        la.getFurnitureDir().addFurniture("bookcase", "Oldddd", Furniture.category.bookcase, 2.99, 2, sysUser, lwarehouse);

        return system;
    }
}
