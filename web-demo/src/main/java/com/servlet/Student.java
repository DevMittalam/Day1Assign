 package com.servlet;
//
public class Student {
   String name;
   String email;
   String number;
   int age;
   String pass;
   String type;
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
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Student(String name, String email, String number, int age, String pass, String type) {
	super();
	this.name = name;
	this.email = email;
	this.number = number;
	this.age = age;
	this.pass = pass;
	this.type = type;
}   
}
