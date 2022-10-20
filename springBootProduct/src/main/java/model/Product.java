package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name="id")
   private String id;
	@Column(name="name")
   private String name;
	@Column(name="price")
   private String price;
	@Column(name="desp")
   private String desp;
	public Product() {
		
	}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getDesp() {
	return desp;
}
public void setDesp(String desp) {
	this.desp = desp;
}
public Product(String id, String name, String price, String desp) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.desp = desp;
}
}
