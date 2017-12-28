package com.eviac.blog.models;

public class User {

	private int idmessage;
	private String mes;
	
	public User() {
		super();
	}

	public int getIdmessage() {
		return idmessage;
	}

	public void setIdmessage(int idmessage) {
		this.idmessage = idmessage;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	@Override
	public String toString() {
		return "User [idmessage=" + idmessage + ", mes=" + mes + "]";
	}
	
	
}
