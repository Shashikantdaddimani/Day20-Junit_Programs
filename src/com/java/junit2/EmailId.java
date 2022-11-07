package com.java.junit2;

import java.util.regex.Pattern;

public class EmailId {
	
	    public boolean validateEmail(String email)
	    {
	        return Pattern.matches("^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", email);
	    }
}
