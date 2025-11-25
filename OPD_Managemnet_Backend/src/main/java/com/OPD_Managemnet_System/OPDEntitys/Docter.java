package com.OPD_Managemnet_System.OPDEntitys;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Docters")
public class Docter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String password;
	
	private String specialization;
	
	private String clinic_name;
	
	private String address;
	
	private long mobileno;
	
	private String token;
	
	private String status;
	
	private Date created_at;
	
	private Date updated_at;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getClinic_name() {
		return clinic_name;
	}

	public void setClinic_name(String clinic_name) {
		this.clinic_name = clinic_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public Docter(int id, String name, String password, String specialization, String clinic_name, String address,
			long mobileno, String token, String status, Date created_at, Date updated_at) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.specialization = specialization;
		this.clinic_name = clinic_name;
		this.address = address;
		this.mobileno = mobileno;
		this.token = token;
		this.status = status;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	@Override
	public String toString() {
		return "DocterEntity [id=" + id + ", name=" + name + ", password=" + password + ", specialization="
				+ specialization + ", clinic_name=" + clinic_name + ", address=" + address + ", mobileno=" + mobileno
				+ ", token=" + token + ", status=" + status + ", created_at=" + created_at + ", updated_at="
				+ updated_at + "]";
	}

	public Docter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
