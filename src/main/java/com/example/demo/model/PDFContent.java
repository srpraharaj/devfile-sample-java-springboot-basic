package com.example.demo.model;

public class PDFContent {
	private String department;
	private String policyNo;
	private String policyDate;
	private String mailGeneratedDate;
	private String policyHolderAddress;
	private byte[] content;

	public byte[] getContent() {
		return "Auto".getBytes();
	}
	public void setContent(byte[] content) {
		this.content = content;
	}
	
	public String getDepartment() {
		return "Auto";
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPolicyNo() {
		return "AUTO1234";
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyDate() {
		return "08-08-2023";
	}
	public void setPolicyDate(String policyDate) {
		this.policyDate = policyDate;
	}

	public String getmailGeneratedDate() {
		return "08-13-2023";
	}
	public void setMailGeneratedDate(String mailGeneratedDate) {
		this.mailGeneratedDate = mailGeneratedDate;
	}

	public String getpolicyHolderAddress() {
		return "Bloomington, US";
	}
	public void setpolicyHolderAddress(String policyHolderAddress) {
		this.policyHolderAddress = policyHolderAddress;
	}
}