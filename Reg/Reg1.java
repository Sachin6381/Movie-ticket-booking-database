package com.Reg;

public class Reg1 {
   private String user_name;
   private String gender;
   private String email_id ;
   private int mobile_number;
   private String password;
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
public int getMobile_number() {
	return mobile_number;
}
public void setMobile_number(int mobile_number) {
	this.mobile_number = mobile_number;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Reg1 [user_name=" + user_name + ", gender=" + gender + ", email_id=" + email_id + ", mobile_number="
			+ mobile_number + ", password=" + password + "]";
}
public Reg1(String user_name, String gender, String email_id, int mobile_number, String password) {
	super();
	this.user_name = user_name;
	this.gender = gender;
	this.email_id = email_id;
	this.mobile_number = mobile_number;
	this.password = password;
}
public Reg1() {
	super();
	// TODO Auto-generated constructor stub
}

}
