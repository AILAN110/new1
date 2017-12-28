package com.eviac.blog.models;

public class Client {

	private String name;
	private String password;
	
	public Client() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", password=" + password + "]";
	}

	
}
