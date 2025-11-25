package com.OPD_Managemnet_System.OPD_DTOs;

import java.sql.Date;

public class Referral_DTO {

	private String note_type;
	private String reson;
	private String details;
	private Date create_at;
	private int docterid;
	private int visitid;
	private int patientid;
	public String getNote_type() {
		return note_type;
	}
	public void setNote_type(String note_type) {
		this.note_type = note_type;
	}
	public String getReson() {
		return reson;
	}
	public void setReson(String reson) {
		this.reson = reson;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
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
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	
	
}
