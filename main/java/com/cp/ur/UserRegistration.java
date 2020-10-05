package com.cp.ur;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface Validation{
	boolean validate(String msg);
}

public class UserRegistration {
	static Scanner sc = new Scanner(System.in);
	
	public static boolean validatefName(String fName) throws UserException{
		Validation valid_fname = (firstName) -> (Pattern.compile(pattern.first).matcher(firstName).matches());
		if(!valid_fname.validate(fName))
			throw new UserException("Enter proper first name");
		return false;
	}
	
	public static boolean validatelName(String lName) throws UserException{
		Validation valid_lname = (lastname) -> (Pattern.compile(pattern.last).matcher(lastname).matches());
		if(!valid_lname.validate(lName))
			throw new UserException("Enter proper last name");
		return false;
	}
	public static boolean validateEmail(String email) throws UserException{
		Validation valid_email = (em) -> (Pattern.compile(pattern.email).matcher(em).matches());
		if(!valid_email.validate(email))
			throw new UserException("Enter proper email");
		return false;
	}
	
	public static boolean validatePno(String phn) throws UserException{
		Validation valid_phno = (mob) -> (Pattern.compile(pattern.phno).matcher(mob).matches());
		if(!valid_phno.validate(phn))
			throw new UserException("Enter proper phone number");
		return false;
	}
	
	public static boolean validatePassword(String password) throws UserException{

		String pass_pattern ="(?=.*[0-9])(?=.*[!@#$%^&*|'<>.-^*()%!])(?=.*[A-Z])[^\\s]{8,}$";
		Pattern pattern = Pattern.compile(pass_pattern);
		Matcher matcher = pattern.matcher(password);
		if(!matcher.matches())
			throw new UserException("Enter proper password");
		return matcher.matches();
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration. ");
//		System.out.println("Enter first name :");
//		validatefName();
//		System.out.println("Enter last name :");
//		validatelName();
//		System.out.println("Enter E-mail address :");
//		validateEmail();
//		System.out.println("Enter phone number with country code :");
//		validatePno();
//		System.out.println("Enter password :");
//		validatePassword();
//		
//		sc.close();
	}

}