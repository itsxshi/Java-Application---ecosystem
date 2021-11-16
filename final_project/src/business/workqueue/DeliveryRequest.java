/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import business.enterprise.DeliveryCompany;
import business.enterprise.WarehouseCompany;
import business.furniture.FurnitureDir;
import business.user.User;
import java.util.Date;

/**
 *
 * @author yi
 */
public class DeliveryRequest extends WorkRequest {

    private String customerOrderId;
    private String warehouseOrderId;
    private String receiverName;
    private String receiverAddress;
    private String receiverRequirements;
    private String receiverPhone;
    private FurnitureDir orderedFurnitures;
    private DeliveryCompany dc;

    public DeliveryRequest(String customerOrderId, String warehouseOrderId, DeliveryCompany dc, String receiverName, String receiverAddress, String receiverRequirements, String receiverPhone, FurnitureDir orderedFurnitures, User requestUser, User resolveUser, Date requestDate, Date resolveDate, status wStatus) {
        super(requestUser, resolveUser, requestDate, resolveDate, wStatus);
        this.customerOrderId = customerOrderId;
        this.warehouseOrderId = warehouseOrderId;
        this.dc = dc;
        this.receiverName = receiverName;
        this.receiverAddress = receiverAddress;
        this.receiverRequirements = receiverRequirements;
        this.receiverPhone = receiverPhone;
        this.orderedFurnitures = orderedFurnitures;
    }

    public String getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(String customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverRequirements() {
        return receiverRequirements;
    }

    public void setReceiverRequirements(String receiverRequirements) {
        this.receiverRequirements = receiverRequirements;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public FurnitureDir getOrderedFurnitures() {
        return orderedFurnitures;
    }

    public void setOrderedFurnitures(FurnitureDir orderedFurnitures) {
        this.orderedFurnitures = orderedFurnitures;
    }

    public String getWarehouseOrderId() {
        return warehouseOrderId;
    }

    public void setWarehouseOrderId(String warehouseOrderId) {
        this.warehouseOrderId = warehouseOrderId;
    }

    public DeliveryCompany getDc() {
        return dc;
    }

    public void setDc(DeliveryCompany dc) {
        this.dc = dc;
    }
    
    

}
