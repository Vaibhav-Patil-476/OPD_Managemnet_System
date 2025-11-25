package com.OPD_Managemnet_System.OPD_DTOs;

import java.sql.Date;

public class Diagnostics_DTO {

	private String name;
	private Date create_at;
	private int docterid;
	private int visitid;
	
	//getter and setter for temp data store and get
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
	public int getDocterid() {
		return docterid;
	}
	public void setDocterid(int docterid) {
		this.docterid = docterid;
	}
	public int getVisitid() {
		return visitid;
	}
	public void setVisitid(int visitid) {
		this.visitid = visitid;
	}
	
	
}
