package com.christian.springdemo.mvc;


public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favCodingLang;

	public String getFavCodingLang() {
		return favCodingLang;
	}

	public void setFavCodingLang(String favCodingLang) {
		this.favCodingLang = favCodingLang;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Student() {
		
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
