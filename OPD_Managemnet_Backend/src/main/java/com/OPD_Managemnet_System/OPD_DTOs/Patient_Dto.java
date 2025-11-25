package com.OPD_Managemnet_System.OPD_DTOs;

import java.sql.Date;

public class Patient_Dto {


	private String patient_name;
	private int age;
	private String gender;
	private long mibileno;
	private String address;
	private String blood_group;
	private String height;
	private String smoking;
	private String alcohol;
	private String tobacoo;
	private Date created_at;
	private int docterid;
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMibileno() {
		return mibileno;
	}
	public void setMibileno(long mibileno) {
		this.mibileno = mibileno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBlood_group() {
		return blood_group;
	}
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getSmoking() {
		return smoking;
	}
	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}
	public String getAlcohol() {
		return alcohol;
	}
	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}
	public String getTobacoo() {
		return tobacoo;
	}
	public void setTobacoo(String tobacoo) {
		this.tobacoo = tobacoo;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public int getDocterid() {
		return docterid;
	}
	public void setDocterid(int docterid) {
		this.docterid = docterid;
	}
	
	
}
