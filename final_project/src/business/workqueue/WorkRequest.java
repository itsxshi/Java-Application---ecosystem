/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import business.user.User;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author yi
 */
public class WorkRequest {
    public enum status {
        Processing("Processing"),
        Ready("Ready for delivery"),
        OnTheWay("On the way"),
        Cancelled("Cancelled"),
        Confirmed("Confirmed"),
        Completed("Completed"),
        Stored("In warehouse"),
        Requested("Customer requested");

        private String value;

        private status(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    private String orderId;
    private User requestUser;
    private User resolveUser;
    private Date requestDate;
    private Date resolveDate;
    private status wStatus;

    public WorkRequest(User requestUser, User resolveUser, Date requestDate, Date resolveDate, status wStatus) {
        this.orderId = UUID.randomUUID().toString().replace("-", "");
        this.requestUser = requestUser;
        this.resolveUser = resolveUser;
        this.requestDate = requestDate;
        this.resolveDate = resolveDate;
        this.wStatus = wStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    
    public User getRequestUser() {
        return requestUser;
    }

    public void setRequestUser(User requestUser) {
        this.requestUser = requestUser;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public User getResolveUser() {
        return resolveUser;
    }

    public void setResolveUser(User resolveUser) {
        this.resolveUser = resolveUser;
    }

    public status getwStatus() {
        return wStatus;
    }

    public void setwStatus(status wStatus) {
        this.wStatus = wStatus;
    }
    
    @Override
    public String toString(){
        return this.orderId;
    }
    
}
