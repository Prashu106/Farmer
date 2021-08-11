package com.lti.bidderRegistration.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FARMER")
public class Bidder {
	@Id
	private int farmer_id;
	private String farmer_name;
	private String email_id;
	private int number;
	private int account_no;
	private int ifsc_code; 
	private int aadhar_no;
	private int pan_no;
	private int certificate_no;
	private int pass;
	private int land_id; 
	private int location_id;
	public Bidder(int farmer_id, String farmer_name, String email_id, int number, int account_no, int ifsc_code,
			int aadhar_no, int pan_no, int certificate_no, int pass, int land_id, int location_id) {
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
	public int getFarmer_id() {
		return farmer_id;
	}
	public void setFarmer_id(int farmer_id) {
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public int getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(int ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public int getAadhar_no() {
		return aadhar_no;
	}
	public void setAadhar_no(int aadhar_no) {
		this.aadhar_no = aadhar_no;
	}
	public int getPan_no() {
		return pan_no;
	}
	public void setPan_no(int pan_no) {
		this.pan_no = pan_no;
	}
	public int getCertificate_no() {
		return certificate_no;
	}
	public void setCertificate_no(int certificate_no) {
		this.certificate_no = certificate_no;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	public int getLand_id() {
		return land_id;
	}
	public void setLand_id(int land_id) {
		this.land_id = land_id;
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	
}
