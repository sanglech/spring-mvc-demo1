package com.christian.springdemo.mvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favCodingLang;
	private ArrayList<String> OSfamiliar;
	
	private LinkedHashMap<String, String> favoriteLanguageOptions;

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
        // populate favorite language options
        favoriteLanguageOptions = new LinkedHashMap<>();
        // parameter order: value, display label
        //
        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("PHP", "PHP");
        favoriteLanguageOptions.put("Ruby", "Ruby"); 
	}
	
	
	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public ArrayList<String> getOSfamiliar() {
		return OSfamiliar;
	}

	public void setOSfamiliar(ArrayList<String> oSfamiliar) {
		OSfamiliar = oSfamiliar;
	}
}
