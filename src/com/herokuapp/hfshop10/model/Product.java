package com.herokuapp.hfshop10.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "category_code")
	private String category_code;
	@Column(name = "name")
	private String name;
	@Column(name = "price")
	private double price;
	@Column(name = "discount")
	private int discount;
	@Column(name = "image")
	private String image;
	@Column(name = "description")
	private String description;
	@Column(name = "color")
	private String color;
	@Column(name = "size")
	private String size;
	@Column(name = "quantity")
	private int quantity;

	public String getCategory_code() {
		return category_code;
	}

	public void setCategory_code(String category_id) {
		this.category_code = category_id;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product(int id, String category_code, String name, double price, int discount, String image,
			String description, String color, String size, int quantity) {
		super();
		this.id = id;
		this.category_code = category_code;
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.image = image;
		this.description = description;
		this.color = color;
		this.size = size;
		this.quantity = quantity;
	}

	public Product() {
		super();
	}

}
