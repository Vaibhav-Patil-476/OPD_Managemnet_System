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
@Table(name="Referrals")
public class Referral {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String note_type;
	private String reson;
	private String details;
	private Date create_at;
	
	@ManyToOne
	@JoinColumn(name="docterid")
	@JsonIgnoreProperties(value={"docterid"}, allowSetters = true)
	private  Docter docterid;
	
	@ManyToOne
	@JoinColumn(name="patientid")
	@JsonIgnoreProperties(value={"patientid"}, allowSetters = true)
	private  Patient patientid;
	
	@ManyToOne
	@JoinColumn(name="visitid")
	@JsonIgnoreProperties(value={"docterid"}, allowSetters = true)
	private  Visit visitid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Docter getDocterid() {
		return docterid;
	}

	public void setDocterid(Docter docterid) {
		this.docterid = docterid;
	}

	public Patient getPatientid() {
		return patientid;
	}

	public void setPatientid(Patient patientid) {
		this.patientid = patientid;
	}

	public Visit getVisitid() {
		return visitid;
	}

	public void setVisitid(Visit visitid) {
		this.visitid = visitid;
	}

	public Referral(int id, String note_type, String reson, String details, Date create_at, Docter docterid,
			Patient patientid, Visit visitid) {
		super();
		this.id = id;
		this.note_type = note_type;
		this.reson = reson;
		this.details = details;
		this.create_at = create_at;
		this.docterid = docterid;
		this.patientid = patientid;
		this.visitid = visitid;
	}

	@Override
	public String toString() {
		return "Referral [id=" + id + ", note_type=" + note_type + ", reson=" + reson + ", details=" + details
				+ ", create_at=" + create_at + ", docterid=" + docterid + ", patientid=" + patientid + ", visitid="
				+ visitid + "]";
	}

	public Referral() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
