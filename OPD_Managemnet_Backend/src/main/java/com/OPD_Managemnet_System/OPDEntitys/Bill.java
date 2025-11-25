package com.OPD_Managemnet_System.OPDEntitys;

import java.math.BigDecimal;
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
@Table(name="Bills")
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	
	private BigDecimal consultation_fee;
	
	private String payment_status;
	
	private String paymet_method;
	
	private BigDecimal concession;
	
	private BigDecimal paid_amount;
	
	private BigDecimal toatl_amount;
	
	private BigDecimal pending_amount;
	
	private Date created_at;
	
	@ManyToOne
	@JoinColumn(name="visitid")
	@JsonIgnoreProperties(value= {"visitid"}, allowSetters = true)
	
	private Visit visitid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getConsultation_fee() {
		return consultation_fee;
	}

	public void setConsultation_fee(BigDecimal consultation_fee) {
		this.consultation_fee = consultation_fee;
	}

	public String getPayment_status() {
		return payment_status;
	}

	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}

	public String getPaymet_method() {
		return paymet_method;
	}

	public void setPaymet_method(String paymet_method) {
		this.paymet_method = paymet_method;
	}

	public BigDecimal getConcession() {
		return concession;
	}

	public void setConcession(BigDecimal concession) {
		this.concession = concession;
	}

	public BigDecimal getPaid_amount() {
		return paid_amount;
	}

	public void setPaid_amount(BigDecimal paid_amount) {
		this.paid_amount = paid_amount;
	}

	public BigDecimal getToatl_amount() {
		return toatl_amount;
	}

	public void setToatl_amount(BigDecimal toatl_amount) {
		this.toatl_amount = toatl_amount;
	}

	public BigDecimal getPending_amount() {
		return pending_amount;
	}

	public void setPending_amount(BigDecimal pending_amount) {
		this.pending_amount = pending_amount;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Visit getVisitid() {
		return visitid;
	}

	public void setVisitid(Visit visitid) {
		this.visitid = visitid;
	}

	public Bill(int id, BigDecimal consultation_fee, String payment_status, String paymet_method, BigDecimal concession,
			BigDecimal paid_amount, BigDecimal toatl_amount, BigDecimal pending_amount, Date created_at,
			Visit visitid) {
		super();
		this.id = id;
		this.consultation_fee = consultation_fee;
		this.payment_status = payment_status;
		this.paymet_method = paymet_method;
		this.concession = concession;
		this.paid_amount = paid_amount;
		this.toatl_amount = toatl_amount;
		this.pending_amount = pending_amount;
		this.created_at = created_at;
		this.visitid = visitid;
	}

	@Override
	public String toString() {
		return "Bill [id=" + id + ", consultation_fee=" + consultation_fee + ", payment_status=" + payment_status
				+ ", paymet_method=" + paymet_method + ", concession=" + concession + ", paid_amount=" + paid_amount
				+ ", toatl_amount=" + toatl_amount + ", pending_amount=" + pending_amount + ", created_at=" + created_at
				+ ", visitid=" + visitid + "]";
	}

	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
