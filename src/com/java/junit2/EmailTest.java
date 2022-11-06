package com.java.junit2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class EmailTest {

		private String emailTest;
	    private boolean expectedResult;
	    private JunitSourceCode validateEmail;
	    
		
			
		public EmailTest(String emailTest, boolean expectedResult, JunitSourceCode validateEmail) {
			super();
			this.emailTest = emailTest;
			this.expectedResult = expectedResult;
			this.validateEmail = validateEmail;
		}
		
		@Before
		 public void initialize() {
		        validateEmail = new JunitSourceCode();
		}
		@Parameterized.Parameters
		public static Collection data() {
			return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
                { "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
                { "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
                { "abc+100@gmail.com", true }, { "abc", false }, { "abc@.com.my", false }, { "abc123@gmail.a", false },
                { "abc123@.com", false }, { "abc123@.com.com", false }, { ".abc@abc.com", false },
                { "abc()*@gmail.com", false }, { "abc@%*.com", false }, { "abc..2002@gmail.com", false },
                { "abc.@gmail.com", false }, { "abc@abc@gmail.com", false }, { "abc@gmail.com.1a", false },
                { "abc@gmail.com.aa.au", false } });
    }
		@Test
	    public void givenEmailAsVar_ShouldReturnTrueorFalse() {
	        assertEquals(expectedResult, validateEmail.validateEmail(emailTest));
	    }
}
		
	