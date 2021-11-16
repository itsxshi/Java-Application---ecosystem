/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.furniture;

import business.enterprise.WarehouseCompany;
import business.user.User;

/**
 *
 * @author yi
 */
public class Furniture {

    public enum category {
        table, sofa, bed, bookcase, chair;
    }

    private boolean isValid;
    private String name;
    private String brand;
    private Furniture.category category;
    private double price;
    private User owner;
    private int quantity;
    private WarehouseCompany warehouse;
    private int shoppingQuantity;

    
    public Furniture(){}
    public Furniture(boolean isValid, String name, String brand, category category, double price, int quantity, User owner, WarehouseCompany warehouse) {
        this.isValid = isValid;
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.owner = owner;
        this.quantity = quantity;
        this.warehouse = warehouse;
    }

    public boolean isIsValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public category getCategory() {
        return category;
    }

    public void setCategory(category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public WarehouseCompany getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(WarehouseCompany warehouse) {
        this.warehouse = warehouse;
    }

    public int getShoppingQuantity() {
        return shoppingQuantity;
    }

    public void setShoppingQuantity(int shoppingQuantity) {
        this.shoppingQuantity = shoppingQuantity;
    }

    
    
    @Override
    public String toString() {
        return this.name;
    }

}
