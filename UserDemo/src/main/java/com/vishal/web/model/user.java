package com.vishal.web.model;

public class user {
	
	private String Lname;
	private String Fname;
	private String Email;
	private String Pass;
	
	
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		this.Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		this.Lname = lname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		this.Pass = pass;
	}
	@Override
	public String toString() {
		return "user [Lname=" + Lname + ", Fname=" + Fname + ", email=" + Email + ", Pass=" + Pass + "]";
	}
	

}
