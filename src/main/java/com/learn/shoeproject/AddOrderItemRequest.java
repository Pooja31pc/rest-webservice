package com.learn.shoeproject;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class AddOrderItemRequest {

    private int quantity;
    private int totalPrice;
    private int size;
    private int customerId;
    private int shoeId;

    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date date;

    public AddOrderItemRequest() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

//    public AddOrderItemRequest(int quantity, int totalPrice, int size, int customerId, int shoeId) {
//        this.quantity = quantity;
//        this.totalPrice = totalPrice;
//        this.size = size;
//        this.customerId = customerId;
//        this.shoeId = shoeId;
//    }


    public AddOrderItemRequest(int quantity, int totalPrice, int size, int customerId, int shoeId, Date date) {
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.size = size;
        this.customerId = customerId;
        this.shoeId = shoeId;
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getShoeId() {
        return shoeId;
    }

    public void setShoeId(int shoeId) {
        this.shoeId = shoeId;
    }
}
