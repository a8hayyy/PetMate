package com.pettify.dataservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserCredential")
public class UserCred{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "useremail", referencedColumnName = "email")
	private User useremail;
	
	@Column(name="password")
	private String password;
	
	public UserCred() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserCred(User useremail, String password) {
		super();
		this.useremail = useremail;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUserEmail() {
		return useremail;
	}

	public void setUserEmail(User useremail) {
		this.useremail = useremail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserCredentialEntity [id=" + id + ", useremail=" + useremail + ", password=" + password + "]";
	}
	
}

