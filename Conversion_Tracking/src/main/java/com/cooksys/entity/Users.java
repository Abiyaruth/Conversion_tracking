package com.cooksys.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class Users {
@Id
@GeneratedValue
private long id;
@Column(name="name")
private String username;
@Column(name="password")
private String password;
@Column(name="num")
private long num;
@Column 
private String role;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public long getNum() {
	return num;
}
public void setNum(long num) {
	this.num = num;
}

public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

public Users(long id, String username, String password, long num, String role) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.num = num;
	this.role = role;
}
public Users() {
	super();
}
public static Users format(String string) {
	// TODO Auto-generated method stub
	return null;
}

}
