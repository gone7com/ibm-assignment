package com.ibm.training.users;

public class User {
	String user_id;
	String first_name;
	String last_name;
	String mobile_num;
	String govt_id_type;
	String govt_id_num;
	String driving_lic;
	String username;
	String pass;
	String email;
	String wallet;
	

	public User(String user_id, String first_name, String last_name, String mobile_num, String govt_id_type,String govt_id_num,
			String driving_lic, String username, String pass, String email, String wallet) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.mobile_num = mobile_num;
		this.govt_id_type = govt_id_type;
		this.govt_id_num = govt_id_num;
		this.driving_lic = driving_lic;
		this.username = username;
		this.pass = pass;
		this.email = email;
		this.wallet = wallet;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String i) {
		this.user_id = i;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getMobile_num() {
		return mobile_num;
	}

	public void setMobile_num(String mobile_num) {
		this.mobile_num = mobile_num;
	}

	public String getGovt_id_type() {
		return govt_id_type;
	}

	public void setGovt_id_type(String govt_id_type) {
		this.govt_id_type = govt_id_type;
	}

	
	public String getGovt_id_num() {
		return govt_id_num;
	}

	public void setGovt_id_num(String govt_id_num) {
		this.govt_id_num = govt_id_num;
	}

	
	
	
	
	
	
	public String getDriving_lic() {
		return driving_lic;
	}

	public void setDriving_lic(String driving_lic) {
		this.driving_lic = driving_lic;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWallet() {
		return wallet;
	}

	public void setWallet(String wallet) {
		this.wallet = wallet;
	}

}
