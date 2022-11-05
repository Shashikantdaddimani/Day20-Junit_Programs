package com.java.junit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration junit = new UserRegistration();
	@Test
	public void when_Given_FirstName_IsCorrect_Should_Return_True()
	{
		boolean result = junit.firstName("Shashikant");
		Assert.assertEquals(true, result);
	}
	@Test
	public void when_Given_FirstName_IsNotCorrect_Should_Return_False()
	{
		boolean result = junit.firstName("shashikant");
		Assert.assertEquals(false, result);
	}
	@Test
	public void when_Given_LastName_IsCorrect_Should_Return_True() {
		boolean result = junit.lastName("Daddimani");
		Assert.assertEquals(true, result);
	}
	@Test
	public void when_Given_LastName_IsNotCorrect_Should_Return_True() {
		boolean result = junit.lastName("daddimani");
		Assert.assertEquals(false, result);
	}
}
