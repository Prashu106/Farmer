package com.lti.bidderRegistration.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BIDDER_TABLE")
public class Bidder {
	@Id
	private String farmer_id;
	private String farmer_name;
	private String email_id;
	private String number;
	private String account_no;
	private String ifsc_code; 
	private String aadhar_no;
	private String pan_no;
	private String certificate_no;
	private String pass;
	private String land_id; 
	private String location_id;
	public Bidder(String farmer_id, String farmer_name, String email_id, String number, String account_no, String ifsc_code,
			String aadhar_no, String pan_no, String certificate_no, String pass, String land_id, String location_id) {
		super();
		this.farmer_id = farmer_id;
		this.farmer_name = farmer_name;
		this.email_id = email_id;
		this.number = number;
		this.account_no = account_no;
		this.ifsc_code = ifsc_code;
		this.aadhar_no = aadhar_no;
		this.pan_no = pan_no;
		this.certificate_no = certificate_no;
		this.pass = pass;
		this.land_id = land_id;
		this.location_id = location_id;
	}
	public Bidder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFarmer_id() {
		return farmer_id;
	}
	public void setFarmer_id(String farmer_id) {
		this.farmer_id = farmer_id;
	}
	public String getFarmer_name() {
		return farmer_name;
	}
	public void setFarmer_name(String farmer_name) {
		this.farmer_name = farmer_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public String getAadhar_no() {
		return aadhar_no;
	}
	public void setAadhar_no(String aadhar_no) {
		this.aadhar_no = aadhar_no;
	}
	public String getPan_no() {
		return pan_no;
	}
	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
	public String getCertificate_no() {
		return certificate_no;
	}
	public void setCertificate_no(String certificate_no) {
		this.certificate_no = certificate_no;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getLand_id() {
		return land_id;
	}
	public void setLand_id(String land_id) {
		this.land_id = land_id;
	}
	public String getLocation_id() {
		return location_id;
	}
	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}
	
}
