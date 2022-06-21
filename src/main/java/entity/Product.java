package entity;

import java.sql.Date;

public class Product {
	private int id;
	private String name;
	private boolean price;
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
	public boolean isPrice() {
		return price;
	}
	public void setPrice(boolean price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Product(int id, String name, boolean price, String image, boolean status, int category_id,
			String description, Date updated_at, Date created_at) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.image = image;
		this.status = status;
		this.category_id = category_id;
		this.description = description;
		this.updated_at = updated_at;
		this.created_at = created_at;
	}
	private String image;
	private boolean status;
	private int category_id;
	private String description;
	private Date updated_at;
	private Date created_at;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
