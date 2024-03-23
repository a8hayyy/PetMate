package com.pettify.dataservice.controller.dto;


public class UserDto {
	
	private Integer id;
	private String userName;
	private String email;
	private String phoneNumber;
	private String pincode;
	
	public UserDto() {
		super();
	}

	public UserDto(Integer id, String userName, String email, String phoneNumber, String pincode) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.pincode = pincode;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", userName=" + userName + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", pincode=" + pincode + "]";
	}
	
}
