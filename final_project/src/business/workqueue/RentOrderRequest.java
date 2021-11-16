/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import business.furniture.FurnitureDir;
import business.user.User;
import java.util.Date;

/**
 *
 * @author yi
 */
public class RentOrderRequest extends WorkRequest{
    
    private FurnitureDir orderedFurnitures;
    private boolean back;
    
    public RentOrderRequest(boolean back,User requestUser, User resolveUser, Date requestDate, Date resolveDate, status wStatus,FurnitureDir orderedFurnitures) {
        super(requestUser, resolveUser, requestDate, resolveDate, wStatus);
        this.orderedFurnitures =orderedFurnitures;
    }

    public FurnitureDir getOrderedFurnitures() {
        return orderedFurnitures;
    }

    public void setOrderedFurnitures(FurnitureDir orderedFurnitures) {
        this.orderedFurnitures = orderedFurnitures;
    }

    public boolean isBack() {
        return back;
    }

    public void setBack(boolean back) {
        this.back = back;
    }

    
    
    
}
