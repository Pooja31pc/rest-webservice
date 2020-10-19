package com.learn.shoeproject;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class ProjectReport {

    List<OrderItem> orders;
    HashMap<String, Long> CategoryBySale;
    Date fromDate;
    Date toDate;

    public ProjectReport(List<OrderItem> orders, HashMap<String, Long> categoryBySale, Date fromDate, Date toDate) {
        this.orders = orders;
        CategoryBySale = categoryBySale;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public List<OrderItem> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderItem> orders) {
        this.orders = orders;
    }

    public HashMap<String, Long> getCategoryBySale() {
        return CategoryBySale;
    }

    public void setCategoryBySale(HashMap<String, Long> categoryBySale) {
        CategoryBySale = categoryBySale;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public ProjectReport() {

    }
}
