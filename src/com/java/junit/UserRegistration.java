package com.java.junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public boolean firstName(String firstName) {
	        String regex = "^[A-Z]{1}[a-z]{2,}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(firstName);
	        return matcher.matches();
	 }
	
	public boolean lastName(String lastName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
	}
	
	public boolean emailId(String emailId) {
		String regex = "^[a-z]+[.][a-zA-Z]+[@][a-zA-Z]+[.][a-z]{2,3}([.][a-zA-Z]{2,3})*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailId);
		return matcher.matches();
		
	}
}
