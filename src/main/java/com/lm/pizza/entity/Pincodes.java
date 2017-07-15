package com.lm.pizza.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pincodes")
public class Pincodes {
	@Id
	@GeneratedValue
	private String id;
	
	@Column
	private String pincodes;
	@Column
	private String locationname;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPincodes() {
		return pincodes;
	}
	public void setPincodes(String pincodes) {
		this.pincodes = pincodes;
	}
	public String getLocationname() {
		return locationname;
	}
	public void setLocationname(String locationname) {
		this.locationname = locationname;
	}
	
	
}
