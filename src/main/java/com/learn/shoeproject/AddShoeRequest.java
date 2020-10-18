package com.learn.shoeproject;

public class AddShoeRequest {

    private String color;
    private String description;
    private int brandId;
    private int categoryId;

    public AddShoeRequest() {
    }

    public AddShoeRequest(String color, String description, int brandId, int categoryId) {
        this.color = color;
        this.description = description;
        this.brandId = brandId;
        this.categoryId = categoryId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
