package com.java.junit2;

import org.junit.Assert;
import org.junit.Test;

public class InvalidUserinputException {
	@Test
    public void when_Given_FirstName_IsCorrect_Should_Return_True() {
        try {
        	JunitSourceCode junit = new JunitSourceCode();
            boolean result = junit.firstNameValidate("Amar");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void when_Given_FirstName_IsNotCorrect_Should_Return_False() {
        try{
        	JunitSourceCode junit = new JunitSourceCode();
        boolean result = junit.firstNameValidate("amar");
        Assert.assertFalse(result);
    } catch (Exception e) {
        }
        }

    @Test
    public void when_Given_LastName_IsCorrect_Should_Return_True() {
        try{
        	JunitSourceCode junit = new JunitSourceCode();
        boolean result = junit.lastNameValidate("Patil");
        Assert.assertTrue(result);
    } catch (Exception e) {
    }
    }

    @Test
    public void when_Given_LastName_IsNotCorrect_Should_Return_false() {
        try{
        	JunitSourceCode junit = new JunitSourceCode();
        boolean result = junit.lastNameValidate("pati");
        Assert.assertFalse(result);
    } catch (Exception e) {
        }
    }

    @Test
    public void when_Given_EmailId_IsCorrect_Should_Return_True() {
        try{
        	JunitSourceCode junit = new JunitSourceCode();
        boolean result = junit.emailValidate("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void when_Given_EmailId_IsNotCorrect_Should_Return_False() {
        try{
        	JunitSourceCode junit = new JunitSourceCode();
        boolean result = junit.emailValidate("abc.xyz@bl.in");
        Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void when_Given_MobileNumber_IsCorrect_Should_Return_True() {
        try{
        	JunitSourceCode junit = new JunitSourceCode();
        boolean result = junit.phoneNumberValidate("91 8426523121");
        Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void when_Given_MobileNumber_IsNotCorrect_Should_Return_True() {
        try{
        	JunitSourceCode junit = new JunitSourceCode();
        boolean result = junit.phoneNumberValidate("9561272972");
        Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void when_Given_Rule1_PassWord_IsCorrect_Should_Return_True() {
        try{
        	JunitSourceCode junit = new JunitSourceCode();
        boolean result = junit.passwordValidate("Abc12345#");
        Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void when_Given_Rule1_PassWord_IsNotCorrect_Should_Return_True() {
        try{
        	JunitSourceCode junit = new JunitSourceCode();
        boolean result = junit.passwordValidate("Amar@12");
        Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

}
