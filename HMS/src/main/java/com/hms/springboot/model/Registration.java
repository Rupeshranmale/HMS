package com.hms.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registration {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	private String name;
	private String address;
	private String Gender;
	private String Disease;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getDisease() {
		return Disease;
	}
	public void setDisease(String disease) {
		Disease = disease;
	}
	@Override
	public String toString() {
		return "Registration [id=" + id + ", name=" + name + ", address=" + address + ", Gender=" + Gender
				+ ", Disease=" + Disease + "]";
	}
	public Registration(Long id, String name, String address, String gender, String disease) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		Gender = gender;
		Disease = disease;
	}


}
