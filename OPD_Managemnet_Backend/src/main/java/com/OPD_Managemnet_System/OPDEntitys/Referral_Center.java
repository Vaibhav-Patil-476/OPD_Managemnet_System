package com.OPD_Managemnet_System.OPDEntitys;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Referral_Center")
public class Referral_Center {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	
	private String name;
	
	private String type;
	
	private int contact_info;
	
	private String address;
	
	private Date created_at;
	
	//create Many to one Relationship
	@ManyToOne
	@JoinColumn(name="docterid")
	@JsonIgnoreProperties(value= {"docterid"},allowSetters = true)
	private Docter docterid;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getContact_info() {
		return contact_info;
	}

	public void setContact_info(int contact_info) {
		this.contact_info = contact_info;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Docter getDocterid() {
		return docterid;
	}

	public void setDocterid(Docter docterid) {
		this.docterid = docterid;
	}

	public Referral_Center(int id, String name, String type, int contact_info, String address, Date created_at,
			Docter docterid) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.contact_info = contact_info;
		this.address = address;
		this.created_at = created_at;
		this.docterid = docterid;
	}

	@Override
	public String toString() {
		return "Referral_Center [id=" + id + ", name=" + name + ", type=" + type + ", contact_info=" + contact_info
				+ ", address=" + address + ", created_at=" + created_at + ", docterid=" + docterid + "]";
	}

	public Referral_Center() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
