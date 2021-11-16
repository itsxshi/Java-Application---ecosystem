/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.ecosystem;

import business.customer.CustomerDir;
import business.network.Network;
import business.user.UserDir;
import java.util.ArrayList;

/**
 *
 * @author yi
 */
public class EcoSystem {
    private static EcoSystem business = null;
    private ArrayList<Network> networkList;
    private UserDir userDir;
    private CustomerDir customerDir;

    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public void reinit (EcoSystem b){
        business = b;
    }
    
    public Network createAndAddNetwork(String networkname){
        for (Network n : networkList){
            if (n.getName().equalsIgnoreCase(networkname)){
                return null;
            }
        }
        Network network=new Network(networkname);
        networkList.add(network);
        return network;
    }
    
    private EcoSystem(){
        networkList=new ArrayList<Network>();
        userDir = new UserDir();
        customerDir = new CustomerDir();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    public Network getNetworkByName(String name){
        for (Network n : networkList){
            if (name.equalsIgnoreCase(n.getName())){
                return n;
            }
        }
        return null;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public UserDir getUserDir() {
        return userDir;
    }

    public void setUserDir(UserDir sysUserDir) {
        this.userDir = sysUserDir;
    }

    public void removeNetwork(String networkName) {
        for (Network n : networkList){
            if (networkName.equalsIgnoreCase(n.getName())){
                networkList.remove(n);
                return;
            }
        }
    }

    public CustomerDir getCustomerDir() {
        return customerDir;
    }

    public void setCustomerDir(CustomerDir customerDir) {
        this.customerDir = customerDir;
    }
    
    
    
}
