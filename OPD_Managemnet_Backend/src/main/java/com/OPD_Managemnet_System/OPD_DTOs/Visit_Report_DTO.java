package com.OPD_Managemnet_System.OPD_DTOs;

import java.sql.Date;

public class Visit_Report_DTO {

	private String file_name;
	private String file_url;
	private String file_type;
	private Date created_at;
	private int visitid;
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getFile_url() {
		return file_url;
	}
	public void setFile_url(String file_url) {
		this.file_url = file_url;
	}
	public String getFile_type() {
		return file_type;
	}
	public void setFile_type(String file_type) {
		this.file_type = file_type;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public int getVisitid() {
		return visitid;
	}
	public void setVsitid(int visitid) {
		this.visitid = visitid;
	}
	
	
}
