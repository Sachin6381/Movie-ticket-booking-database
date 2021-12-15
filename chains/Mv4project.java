package com.chains;

public class Mv4project {
      private int user_name ;
      private int user_id;
      private String email_id;
      private int mobile_num;
      private String gender;
	public int getUser_name() {
		return user_name;
	}
	public void setUser_name(int user_name) {
		this.user_name = user_name;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public int getMobile_num() {
		return mobile_num;
	}
	public void setMobile_num(int mobile_num) {
		this.mobile_num = mobile_num;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Mv4project [user_name=" + user_name + ", user_id=" + user_id + ", email_id=" + email_id
				+ ", mobile_num=" + mobile_num + ", gender=" + gender + "]";
	}
	public Mv4project(int user_name, int user_id, String email_id, int mobile_num, String gender) {
		super();
		this.user_name = user_name;
		this.user_id = user_id;
		this.email_id = email_id;
		this.mobile_num = mobile_num;
		this.gender = gender;
	}
	public Mv4project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}