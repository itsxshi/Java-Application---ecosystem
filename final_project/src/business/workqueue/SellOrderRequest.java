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
public class SellOrderRequest extends WorkRequest {
    
    private FurnitureDir orderedFurnitures;
    
    public SellOrderRequest(User requestUser, User resolveUser, Date requestDate, Date resolveDate, WorkRequest.status status,FurnitureDir orderedFurnitures) {
        super(requestUser, resolveUser, requestDate, resolveDate, status);
        this.orderedFurnitures = orderedFurnitures;
    }
    
    public FurnitureDir getOrderedFurnitures() {
        return orderedFurnitures;
    }

    public void setOrderedFurnitures(FurnitureDir orderedFurnitures) {
        this.orderedFurnitures = orderedFurnitures;
    }
}
