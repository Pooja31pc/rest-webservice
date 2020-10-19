package com.learn.shoeproject;

public class CategorySales {

    private String category;
    private long totalPrice;

    public CategorySales(String category, long totalPrice) {
        this.category = category;
        this.totalPrice = totalPrice;
    }

    public CategorySales() {

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }
}
