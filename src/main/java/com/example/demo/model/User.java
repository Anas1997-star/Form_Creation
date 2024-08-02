package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="UserRegistration")
public class User {
	@Id
private int id;
private String name;
private String email;
private String address;
private long phoneno;
private String password;
private String confirm_password;
private String gender;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getPhoneno() {
	return phoneno;
}
public void setPhoneno(long phoneno) {
	this.phoneno = phoneno;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirm_password() {
	return confirm_password;
}
public void setConfirm_password(String confirm_password) {
	this.confirm_password = confirm_password;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", phoneno=" + phoneno
			+ ", password=" + password + ", confirm_password=" + confirm_password + ", gender=" + gender + "]";
}
public User() {
	super();
}
public User(int id, String name, String email, String address, long phoneno, String password, String confirm_password,
		String gender) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.address = address;
	this.phoneno = phoneno;
	this.password = password;
	this.confirm_password = confirm_password;
	this.gender = gender;
}
}
