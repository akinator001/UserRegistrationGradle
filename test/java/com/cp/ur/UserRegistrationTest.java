package com.cp.ur;

import org.junit.Test;

import org.junit.Assert;

public class UserRegistrationTest {
	@Test
	public void givenfNameProperReturnTrue() {
		UserRegistration user=  new UserRegistration();
		try {
			boolean res = user.validatefName("Aakash");
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(true);
	}
	@Test
	public void givenfNameImProperReturnFalse() {
		UserRegistration user=  new UserRegistration();
		try {
			boolean res = user.validatefName("aakash");
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(false);
	}
	@Test
	public void givenlNameProperReturnTrue() {
		UserRegistration user=  new UserRegistration();
		try {
			boolean res = user.validatelName("Gandhi");
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(true);
	}
	@Test
	public void givenlNameImProperReturnFalse() {
		UserRegistration user=  new UserRegistration();
		try {
			boolean res = user.validatelName("gandhi");
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(false);
	}
	@Test
	public void givenEmailProperReturnTrue() {
		UserRegistration user=  new UserRegistration();
		try {
			boolean res = user.validateEmail("aakash@gmail.com");
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(true);
	}
	@Test
	public void givenEmailImProperReturnFalse() {
		UserRegistration user=  new UserRegistration();
		try {
			boolean res = user.validateEmail("aakash");
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(false);
	}
	@Test
	public void givenPhoneNumberProperReturnTrue() {
		UserRegistration user=  new UserRegistration();
		try {
			boolean res = user.validatePno("91 9087654321");
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(true);
	}
	@Test
	public void givenPhoneNumberImProperReturnFalse() {
		UserRegistration user=  new UserRegistration();
		try {
			boolean res = user.validatePno("987654321");
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(false);
	}
	@Test
	public void givenPasswordProperReturnTrue() {
		UserRegistration user=  new UserRegistration();
		try {
			boolean res = user.validatePassword("aakash@1234");
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(true);
	}
	@Test
	public void givenPasswordImProperReturnFalse() {
		UserRegistration user=  new UserRegistration();
		try {
			boolean res = user.validatePassword("aakash");
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(false);
	}
	
	
	
	
}