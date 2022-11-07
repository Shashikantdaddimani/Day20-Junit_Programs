package com.java.junit2;
@FunctionalInterface
public interface UserRegistrationInterface {
	public abstract boolean userEntries(String value) throws InvalidUserinputException;
}
