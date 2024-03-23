package com.pettify.dataservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="username")
    private String userName;

    @Column(unique = true)
    private String email;
    
    @Column(name="phonenumber", unique=true)
    private String phoneNumber;
    
    @Column(name="pincode")
    private String pincode;

    public User() {
		super();
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
		return "UserEntity [id=" + id + ", userName=" + userName + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", pincode=" + pincode + "]";
	}
    	
}
