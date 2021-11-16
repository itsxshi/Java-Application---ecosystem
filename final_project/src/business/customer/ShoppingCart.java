/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.customer;

import business.furniture.FurnitureDir;

/**
 *
 * @author yi
 */
public class ShoppingCart {
    private FurnitureDir furnitureDir;
    public ShoppingCart(){
        this.furnitureDir = new FurnitureDir();
    }
    
    public ShoppingCart(FurnitureDir furnitureDir){
        this.furnitureDir = furnitureDir;
    }

    public FurnitureDir getFurnitureDir() {
        return furnitureDir;
    }

    public void setFurnitureDir(FurnitureDir furnitureDir) {
        this.furnitureDir = furnitureDir;
    }
    
    public void clearShoppingCart(){
        this.furnitureDir.getFurnitureDir().clear();
    }
}
