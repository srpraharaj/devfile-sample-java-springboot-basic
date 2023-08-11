package com.example.demo.model;

public class ResponseObject {
	
	private String fileName;
	private String parentId;
	private PDFContent pdfContent;
	
	
	public String getFileName() {
		return "policy.csv";
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getParentId() {
		return "221446918857";
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public PDFContent getPdfContent() {
		return pdfContent;
	}
	public void setPdfContent(PDFContent pdfContent) {
		this.pdfContent = pdfContent;
	}
}