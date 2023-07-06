package com.registrationservlet;

public class UserData {
private String username;
private String password;
private String email;
private String selectcountry;
private String qualification;
private String gender;
private String technologies;
private String address;
private String commentss;
public UserData() {
	super();
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSelectcountry() {
	return selectcountry;
}
public void setSelectcountry(String selectcountry) {
	this.selectcountry = selectcountry;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getTechnologies() {
	return technologies;
}
public void setTechnologies(String technologies) {
	this.technologies = technologies;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCommentss() {
	return commentss;
}
public void setCommentss(String commentss) {
	this.commentss = commentss;
}
@Override
public String toString() {
	return "UserData [username=" + username + ", password=" + password + ", email=" + email + ", selectcountry="
			+ selectcountry + ", qualification=" + qualification + ", gender=" + gender + ", technologies="
			+ technologies + ", address=" + address + ", commentss=" + commentss + "]";
}
public UserData(String username, String password, String email, String selectcountry, String qualification,
		String gender, String technologies, String address, String commentss) {
	super();
	this.username = username;
	this.password = password;
	this.email = email;
	this.selectcountry = selectcountry;
	this.qualification = qualification;
	this.gender = gender;
	this.technologies = technologies;
	this.address = address;
	this.commentss = commentss;
}

}
