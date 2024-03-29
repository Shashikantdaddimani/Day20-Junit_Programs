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
	public void when_Given_LastName_IsNotCorrect_Should_Return_false() {
		boolean result = junit.lastName("daddimani");
		Assert.assertEquals(false, result);
	}
	@Test
	public void when_Given_EmailId_IsCorrect_Should_Return_True() {
		boolean result = junit .emailId("abc.xyz@bl.co.in");
		Assert.assertEquals(true, result);
	}
	@Test
	public void when_Given_EmailId_IsNotCorrect_Should_Return_False() {
		boolean result = junit.emailId("Abc.1xy@.bl.src.in");
		Assert.assertEquals(false, result);
	}
	@Test
	public void when_Given_MobileNumber_IsCorrect_Should_Return_True() {
		boolean result = junit.mobileNumber("91 9113264303");
		Assert.assertEquals(true, result);
	}
	@Test
	public void when_Given_MobileNumber_IsNotCorrect_Should_Return_False() {
		boolean result = junit.mobileNumber("91 5113264303");
		Assert.assertEquals(false, result);
   }
	 @Test
	    public void when_Given_Rule1_PassWord_IsCorrect_Should_Return_True(){
		 boolean result = junit.rule1_passWord("Sdaddimani");
		 Assert.assertEquals(true, result);
	}
	@Test
	 public void when_Given_Rule1_PassWord_IsNotCorrect_Should_Return_False(){
		 boolean result = junit.rule1_passWord("sdaddimaoni");
		 Assert.assertEquals(false, result);
	}
	@Test
    public void when_Given_Rule2_PassWord_IsCorrect_Should_Return_True(){
	 boolean result = junit.rule2_passWord("Sdaddima19");
	 Assert.assertEquals(true, result);
    }
	@Test
 	public void when_Given_Rule2_PassWord_IsNotCorrect_Should_Return_False(){
		boolean result = junit.rule2_passWord("sdaddimani");
		Assert.assertEquals(false, result);
}
	@Test
    public void when_Given_Rule3_PassWord_IsCorrect_Should_Return_True(){
	 boolean result = junit.rule3_passWord("sdaddiman");
	 Assert.assertEquals(true, result);
    }
	@Test
 	public void when_Given_Rule3_PassWord_IsNotCorrect_Should_Return_False(){
		boolean result = junit.rule3_passWord("sdaddimaniiig");
		Assert.assertEquals(false, result);
	}
	@Test
    public void when_Given_Rule4_PassWord_IsCorrect_Should_Return_True(){
	 boolean result = junit.rule4_passWord("Sdaddi@12");
	 Assert.assertEquals(true, result);
    }
	@Test
 	public void when_Given_Rule4_PassWord_IsNotCorrect_Should_Return_False(){
		boolean result = junit.rule4_passWord("Sdaddi12");
		Assert.assertEquals(false, result);
	}
	@Test
    public void when_GivenEmailId_IsCorrect_Should_Return_True(){
	 boolean result = junit.emailIdValidater("abc.xyz@bl.co.in");
	 Assert.assertEquals(true, result);
    }
	@Test
 	public void when_GivenEmailId_IsNotCorrect_Should_Return_False(){
		boolean result = junit.emailIdValidater("abc...001@Gmail.com");
		Assert.assertEquals(false, result);
	}
	
	
	
	
	
	
	
}
