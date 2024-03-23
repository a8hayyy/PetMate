package com.pettify.dataservice.controller.dto;

public class UserCredDto {
	private Integer id;
	private String userEmail;
	private String password;
	
	public UserCredDto() {
		super();
	}

	public UserCredDto(Integer id, String userEmail, String password) {
		super();
		this.id = id;
		this.userEmail = userEmail;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserCredentialDto [id=" + id + ", userEmail=" + userEmail + ", password=" + password + "]";
	}
}
