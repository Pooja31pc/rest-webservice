package com.learn.shoeproject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int categoryId;
	private String shoeCategory;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getShoeCategory() {
		return shoeCategory;
	}

	public void setShoeCategory(String shoeCategory) {
		this.shoeCategory = shoeCategory;
	}

	public Category(int categoryId, String shoeCategory) {
		this.categoryId = categoryId;
		this.shoeCategory = shoeCategory;
	}

	public Category() {
	}
}
