package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
@Entity(name="category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cat")
	private int id_cat;
	@NotEmpty(message = "{form.validate.notempty}")
	@Length(min = 3, max = 50, message = "{form.validate.mustrange}")
	@Column(name = "name_cat")
	private String name_cat;
	@Column(name = "status")
	private boolean status ;
	public Category(int id_cat, String name_cat, boolean status) {
		super();
		this.id_cat = id_cat;
		this.name_cat = name_cat;
		this.status = status;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_cat() {
		return id_cat;
	}
	public void setId_cat(int id_cat) {
		this.id_cat = id_cat;
	}
	public String getName_cat() {
		return name_cat;
	}
	public void setName_cat(String name_cat) {
		this.name_cat = name_cat;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void setImglink(String filename) {
		// TODO Auto-generated method stub
		
	}
}
