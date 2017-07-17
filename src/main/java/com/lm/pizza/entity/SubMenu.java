package com.lm.pizza.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="submenu")
public class SubMenu {
	@Id
	@GeneratedValue
	private String id;
	
	@Column
	private String submenuid;
	
	@Column
	private String menu;
	
	@Column
	private String submenuname;
	
	@Column
	private String submenusize;
	
	@Column
	private String submenucost;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMenuid() {
		return submenuid;
	}
	public void setMenuid(String menuid) {
		this.submenuid = menuid;
	}
	public String getSubMenuName() {
		return submenuname;
	}
	public void setMenuName(String submenuName) {
		this.submenuname = submenuName;
	}
	public String getSubmenuid() {
		return submenuid;
	}
	public void setSubmenuid(String submenuid) {
		this.submenuid = submenuid;
	}
	public String getSubmenuname() {
		return submenuname;
	}
	public void setSubmenuname(String submenuname) {
		this.submenuname = submenuname;
	}
	public String getSubmenusize() {
		return submenusize;
	}
	public void setSubmenusize(String submenusize) {
		this.submenusize = submenusize;
	}
	public String getSubmenucost() {
		return submenucost;
	}
	public void setSubmenucost(String submenucost) {
		this.submenucost = submenucost;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}	
	
	
}
