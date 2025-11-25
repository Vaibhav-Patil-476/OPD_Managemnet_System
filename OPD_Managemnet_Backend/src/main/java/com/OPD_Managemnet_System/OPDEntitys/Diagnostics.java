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
@Table(name="Diagnostics")
public class Diagnostics {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private Date create_at;
	
	
	@ManyToOne
	@JoinColumn(name="visitid")
	@JsonIgnoreProperties(value="visitid",allowSetters = true)
	private Visit visitid;
	
	@ManyToOne
	@JoinColumn(name="docterid")
	@JsonIgnoreProperties(value="docterid",allowSetters = true)
	private Docter docterid;

	
	//getter and setter for Diagnostics
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

	public Date getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}

	public Visit getVisitid() {
		return visitid;
	}

	public void setVisitid(Visit visitid) {
		this.visitid = visitid;
	}

	public Docter getDocterid() {
		return docterid;
	}

	public void setDocterid(Docter docterid) {
		this.docterid = docterid;
	}

	//this is parameter construct of diagnostics
	public Diagnostics(int id, String name, Date create_at, Visit visitid, Docter docterid) {
		super();
		this.id = id;
		this.name = name;
		this.create_at = create_at;
		this.visitid = visitid;
		this.docterid = docterid;
	}

	//toString method
	@Override
	public String toString() {
		return "Diagnostics [id=" + id + ", name=" + name + ", create_at=" + create_at + ", visitid=" + visitid
				+ ", docterid=" + docterid + "]";
	}

	//Super Class
	public Diagnostics() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
