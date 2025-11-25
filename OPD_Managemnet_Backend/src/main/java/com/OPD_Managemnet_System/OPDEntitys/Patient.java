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
@Table(name="Patients")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
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
	
	@ManyToOne
	@JoinColumn(name="docterid")
	@JsonIgnoreProperties(value="docterid",allowSetters = true)
	private Docter docterid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Docter getDocterid() {
		return docterid;
	}

	public void setDocterid(Docter docterid) {
		this.docterid = docterid;
	}

	public Patient(int id, String patient_name, int age, String gender, long mibileno, String address,
			String blood_group, String height, String smoking, String alcohol, String tobacoo, Date created_at,
			Docter docterid) {
		super();
		this.id = id;
		this.patient_name = patient_name;
		this.age = age;
		this.gender = gender;
		this.mibileno = mibileno;
		this.address = address;
		this.blood_group = blood_group;
		this.height = height;
		this.smoking = smoking;
		this.alcohol = alcohol;
		this.tobacoo = tobacoo;
		this.created_at = created_at;
		this.docterid = docterid;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", patient_name=" + patient_name + ", age=" + age + ", gender=" + gender
				+ ", mibileno=" + mibileno + ", address=" + address + ", blood_group=" + blood_group + ", height="
				+ height + ", smoking=" + smoking + ", alcohol=" + alcohol + ", tobacoo=" + tobacoo + ", created_at="
				+ created_at + ", docterid=" + docterid + "]";
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
