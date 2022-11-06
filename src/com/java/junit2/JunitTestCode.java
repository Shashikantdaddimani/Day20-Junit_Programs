package com.java.junit2;

import org.junit.Assert;
import org.junit.Test;



public class JunitTestCode {
	@Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
		JunitSourceCode userRegistrationRegEx = new JunitSourceCode();
        boolean result = userRegistrationRegEx.firstNameValidate("Shashikant");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
    	JunitSourceCode userRegistrationRegEx = new JunitSourceCode();
        boolean result = userRegistrationRegEx.firstNameValidate("shashikant");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
    	JunitSourceCode userRegistrationRegEx = new JunitSourceCode();
        boolean result = userRegistrationRegEx.lastNameValidate("Kmpl");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse() {
    	JunitSourceCode userRegistrationRegEx = new JunitSourceCode();
        boolean result = userRegistrationRegEx.lastNameValidate("kmp");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
    	JunitSourceCode userRegistrationRegEx = new JunitSourceCode();
        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse() {
    	JunitSourceCode userRegistrationRegEx = new JunitSourceCode();
        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhone_whenProper_ShouldReturnTrue() {
    	JunitSourceCode userRegistrationRegEx = new JunitSourceCode();
        boolean result = userRegistrationRegEx.phoneNumberValidate("91 9611327430");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhone_whenNotProper_ShouldReturnFalse() {
    	JunitSourceCode userRegistrationRegEx = new JunitSourceCode();
        boolean result = userRegistrationRegEx.phoneNumberValidate("9901523658");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_whenProper_ShouldReturnTrue() {
    	JunitSourceCode userRegistrationRegEx = new JunitSourceCode();
        boolean result = userRegistrationRegEx.passwordValidate("Ast85231#");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse() {
    	JunitSourceCode userRegistrationRegEx = new JunitSourceCode();
        boolean result = userRegistrationRegEx.passwordValidate("shashi24#%");
        Assert.assertFalse(result);
    }
}
