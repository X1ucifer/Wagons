package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "taxiData") 
public class DriversModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "taxi_number", length=255)
	private String TaxiNumber;

	@Column(name = "taxi_img")
	public String TaxiImg;
	
	@Column(name = "driver_name", length=255)
	private String DriverName;
	
	@Column(name = "phone_number")
	private Integer PhoneNumber;
	
	@Column(name = "cab_name", length=255)
	private String CabName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTaxiNumber() {
		return TaxiNumber;
	}

	public void setTaxiNumber(String taxiNumber) {
		this.TaxiNumber = taxiNumber;
	}

	public String getTaxiImg() {
		return TaxiImg;
	}

	public void setTaxiImg(String taxiImg) {
		this.TaxiImg = taxiImg;
	}

	public String getDriverName() {
		return DriverName;
	}

	public void setDriverName(String driverName) {
		this.DriverName = driverName;
	}

	public Integer getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.PhoneNumber = phoneNumber;
	}

	public String getCabName() {
		return CabName;
	}

	public void setCabName(String cabName) {
		this.CabName = cabName;
	}
	
	
	

}
