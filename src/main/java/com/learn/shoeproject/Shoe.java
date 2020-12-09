package com.learn.shoeproject;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Shoe {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int shoeId;
	private String color;
	private String description;
	
	@OneToOne(targetEntity= Brand.class)
	private Brand brand;

	@OneToOne(targetEntity=Category.class)
	private Category category;

	public int getShoeId() {
		return shoeId;
	}

	public void setShoeId(int shoeId) {
		this.shoeId = shoeId;
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

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Shoe() {
	}

	public Shoe(int shoeId, String color, String description, Brand brand, Category category) {
		this.shoeId = shoeId;
		this.color = color;
		this.description = description;
		this.brand = brand;
		this.category = category;
	}

	public Shoe(String color, String description, Brand brand, Category category) {
		this.color = color;
		this.description = description;
		this.brand = brand;
		this.category = category;
	}
}
