package com.OPD_Managemnet_System.OPDEntitys;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Medicines")
public class Medicine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String type;
	
	//create Many to one Relationship
	@ManyToOne
	@JoinColumn(name="docterid")
	@JsonIgnoreProperties(value={"docterid"}, allowSetters = true)
	private  Docter docterid;

	//generate gatter,setter,superclass,default and para* constructor
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

	public Docter getDocterid() {
		return docterid;
	}

	public void setDocterid(Docter docterid) {
		this.docterid = docterid;
	}

	public Medicine(int id, String name, String type, Docter docterid) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.docterid = docterid;
	}

	@Override
	public String toString() {
		return "Medicine [id=" + id + ", name=" + name + ", type=" + type + ", docterid=" + docterid + "]";
	}

	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
