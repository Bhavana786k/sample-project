package com.klu.model;

import jakarta.persistence.*;

@Entity
@Table(name="klu_user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int uid;
	String uname;
	String upassword;
	String urole;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getUrole() {
		return urole;
	}
	public void setUrole(String urole) {
		this.urole = urole;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upassword=" + upassword + ", urole=" + urole + "]";
	}
	

}
