package com.java.junit2;

import org.junit.Assert;
import org.junit.Test;

public class InvalidUserinputException extends Exception {
	 enum ExceptionType {
	        INVALID_FIRST_NAME, INVALID_LAST_NAME, INVALID_PASSWORD, INVALID_PHONE_NUMBER, INVALID_EMAIL;
	    }

	    ExceptionType type;

	    public InvalidUserinputException(ExceptionType type, String msg) {
	        super(msg);
	        this.type = type;
	    }
}
