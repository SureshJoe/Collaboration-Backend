package com.Collaboration.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetail {

@Id
private String username;
private String firstname;
private String surname;
private String password;
private String emailId;
private String role="ROLE_USER";
private String status;
private String isOnline;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getIsOnline() {
	return isOnline;
}
public void setIsOnline(String isOnline) {
	this.isOnline = isOnline;
}

}
