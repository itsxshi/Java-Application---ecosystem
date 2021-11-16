/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import business.enterprise.AssemblyCompany;
import business.enterprise.DeliveryCompany;
import business.enterprise.WarehouseCompany;
import business.furniture.Furniture;
import business.furniture.FurnitureDir;
import business.user.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author yi
 */
public class WorkQueue {

    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public BuyOrderRequest createBuyOrderRequest(User buyer,FurnitureDir ordered) {
        BuyOrderRequest or = new BuyOrderRequest(buyer, buyer, new Date(), new Date(), WorkRequest.status.Processing,ordered);

        this.workRequestList.add(or);
        return or;
    }
    
    public SellOrderRequest createSellOrderRequest(User seller,FurnitureDir ordered) {
        SellOrderRequest sr = new SellOrderRequest(seller, seller, new Date(), new Date(), WorkRequest.status.Processing,ordered);

        this.workRequestList.add(sr);
        return sr;
    }
    
     public RentOrderRequest createRentOrderRequest(User seller,FurnitureDir ordered) {
        RentOrderRequest rr = new RentOrderRequest(false,seller, seller, new Date(), new Date(), WorkRequest.status.Processing,ordered);

        this.workRequestList.add(rr);
        return rr;
    }
    
    public WorkRequest getOrderById(String id){
        for (WorkRequest wr : workRequestList ){
            if (wr.getOrderId().equals(id)){
                return wr;
            }
        }
        return null;
    }
    
    public WorkRequest getAssemblyRequestByOrderid(String id){
        for (WorkRequest wr : workRequestList){
            if (wr instanceof AssemblyRequest){
                if (((AssemblyRequest) wr).getCustomerOrderId().equals(id)){
                    return wr;
                }
            }
        }
        return null;
    }
    
    public WorkRequest getWarehouseRequest(String id){
        for (WorkRequest wr : workRequestList){
            if (wr instanceof WarehouseRequest){
                if (((WarehouseRequest) wr).getCustomerOrderId().equals(id)){
                    return wr;
                }
            }
        }
        return null;
    }
    
    

    public DeliveryRequest createDeliveryRequest(String customerOrderId, String warehouseOrderId, DeliveryCompany dc, String receiverName, String receiverAddress, String receiverRequirements, String receiverPhone, User requestUser, FurnitureDir orderedFurnitures) {
        DeliveryRequest dr = new DeliveryRequest(customerOrderId, warehouseOrderId, dc, receiverName, receiverAddress, receiverRequirements, receiverPhone, orderedFurnitures, requestUser, null, new Date(), null, WorkRequest.status.Processing);
        this.workRequestList.add(dr);
        return dr;
    }
    
    public AssemblyRequest createAssemblyRequest(String customerOrderId, AssemblyCompany ac, String receiverName, String receiverAddress, String receiverRequirements, String receiverPhone, User requestUser, FurnitureDir orderedFurnitures){
        AssemblyRequest ar = new AssemblyRequest(customerOrderId, ac, receiverName, receiverAddress, receiverRequirements, receiverPhone, orderedFurnitures, requestUser, null, new Date(), null, WorkRequest.status.Processing);
        this.workRequestList.add(ar);
        return ar;
    }

    public WarehouseRequest createWarehouseRequest(String customerOrderId, String receiverName, String receiverAddress, String receiverRequirements, String receiverPhone, User requestUser, FurnitureDir orderedFurnitures) {
        WarehouseRequest wr = null;
        Map<WarehouseCompany, FurnitureDir> maps = new HashMap<>();
        for (Furniture f : orderedFurnitures.getFurnitureDir()) {
            if (maps.containsKey(f.getWarehouse())) {
                FurnitureDir fDir = maps.get(f.getWarehouse());
                fDir.addFurniture(f);
                maps.put(f.getWarehouse(), fDir);
            } else {
                FurnitureDir fDir = new FurnitureDir();
                fDir.addFurniture(f);
                maps.put(f.getWarehouse(), fDir);
            }
        }
        for (WarehouseCompany wc : maps.keySet()) {
            wr = new WarehouseRequest(customerOrderId, receiverName, receiverAddress, receiverRequirements, receiverPhone, maps.get(wc), requestUser, null, new Date(), null, WorkRequest.status.Processing, wc);
            this.workRequestList.add(wr);
        }
        return wr;
    }

    public WorkRequest getWarehouseRequestByOrderId(String orderId) {
        for (WorkRequest wr : workRequestList){
            if (wr instanceof WarehouseRequest){
                if (((WarehouseRequest) wr).getCustomerOrderId().equals(orderId)){
                    return wr;
                }
            }
        }
        return null;
    }
}
