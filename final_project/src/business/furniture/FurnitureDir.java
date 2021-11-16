/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.furniture;

import business.enterprise.WarehouseCompany;
import business.user.User;
import java.util.ArrayList;

/**
 *
 * @author yi
 */
public class FurnitureDir {

    private ArrayList<Furniture> furnitureDir;

    public FurnitureDir() {
        furnitureDir = new ArrayList<>();
    }

    public ArrayList<Furniture> getFurnitureDir() {
        return furnitureDir;
    }

    public void setFurnitureDir(ArrayList<Furniture> furnitureDir) {
        this.furnitureDir = furnitureDir;
    }

    public Furniture addFurniture(String name, String brand, Furniture.category category, double price, int quantity, User owner, WarehouseCompany warehouse) {
        Furniture f = new Furniture(true, name, brand, category, price, quantity, owner, warehouse);
        furnitureDir.add(f);
        return f;
    }

    public Furniture addFurniture(Furniture f) {
        for (Furniture f1 : furnitureDir) {
            if (f1.getName().equals(f.getName())) {
                f1.setShoppingQuantity(f1.getShoppingQuantity()+ f.getShoppingQuantity());
                return f1;
            }
        }
        furnitureDir.add(f);
        return f;
    }
    
    public void addFurnitures(ArrayList<Furniture> furnitures) {
       for (Furniture f : furnitures){
           furnitureDir.add(f);
       }
    }

    public Furniture getFurniture(Furniture f) {
        for (Furniture f1 : furnitureDir) {
            if (f1.getName().equals(f.getName())) {
                return f1;
            }
        }
        return null;
    }

    public void removeFurniture(Furniture f) {
        for (Furniture f1 : furnitureDir) {
            if (f1.getName().equals(f.getName())) {
                furnitureDir.remove(f1);
                return;
            }
        }
    }

    public void removeFurniture(Furniture f, int quantity) {
        for (Furniture f1 : furnitureDir) {
            if (f1.getName().equals(f.getName())) {
                if (quantity >= f1.getQuantity()) {
                    furnitureDir.remove(f1);
                } else {
                    f1.setQuantity(f1.getQuantity() - quantity);
                }

                return;
            }
        }
    }

    @Override
    public String toString() {
        String str = "";
        for (Furniture f : furnitureDir) {
            str += f.getCategory()+" "+f.getName() + f.getQuantity() + ",";
        }
        if (str.length() > 1) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    
}
