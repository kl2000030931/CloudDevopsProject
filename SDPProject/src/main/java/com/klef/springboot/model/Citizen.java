package com.klef.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "citizen_table")
public class Citizen 
{
  @Id
  @GeneratedValue
   private int id;
  @Column(nullable = false,length = 200)
   private String name;
  @Column(nullable = false,length = 10)
   private String gender;
  @Column(nullable = false,length = 100)
   private String sector;
  @Column(nullable = false,precision = 10,scale = 4)
   private double age;
  @Column(nullable = false,length = 200)
  private String emailid;
  @Column(nullable = false,unique = true,length = 200)
   private String username;
  @Column(nullable = false,length = 200)
   private String password;
  
  @Column(nullable = false,length = 200)
  private String contactno;
   
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
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getSector() {
	return sector;
}
public void setSector(String sector) {
	this.sector = sector;
}
public double getAge() {
	return age;
}
public void setAge(double age) {
	this.age = age;
}

public String getContactno() {
	return contactno;
}
public void setContactno(String contactno) {
	this.contactno = contactno;
}

public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
@Override
public String toString() {
	return "Citizen [id=" + id + ", name=" + name + ", gender=" + gender + ", sector=" + sector + ", age=" + age + ", emailid=" + emailid + ", username=" + username + ", password=" + password + ", contactno="
			+ contactno + "]";
}
}
