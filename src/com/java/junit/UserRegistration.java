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
	public boolean mobileNumber(String mobileNumber) {
		String regex ="^(91)[ ]{1}[6-9]{1}[0-9]{9}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobileNumber);
		return matcher.matches();
	}
	public boolean rule1_passWord(String password) {
		String regex = "((?=.*[A-Z]).{8,})";
		Pattern pattern = Pattern .compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
		
	}
	public boolean rule2_passWord(String password) {
		String regex = "((?=.*[A-Z])(?=.*[0-9]).{8,})";
		Pattern pattern = Pattern .compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	
}
	public boolean rule3_passWord(String password) {
		String regex = "((?=.[a-z]).{8,9})";
		Pattern pattern = Pattern .compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	
	}
	public boolean rule4_passWord(String password) {
		String regex = "((?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$-%^&*]).{8,})";
		Pattern pattern = Pattern .compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	
	}
	public boolean emailIdValidater(String emailId) {
		String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
		Pattern pattern = Pattern .compile(regex);
		Matcher matcher = pattern.matcher(emailId);
		return matcher.matches();
	
	}
}
