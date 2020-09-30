package com.cp.ur;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
	static Scanner sc = new Scanner(System.in);
	
	public static boolean validatefName(String fName) throws UserException{
//		String fName = sc.next();
		
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher(fName);
		if(!matcher.matches())
			throw new UserException("Enter proper first name");
		return matcher.matches();
	}
	
	public static boolean validatelName(String lName) throws UserException{
//		String lName = sc.next();
		
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher(lName);
		if(!matcher.matches())
			throw new UserException("Enter proper last name");
		return matcher.matches();
	}
	public static boolean validateEmail(String email) throws UserException{
//		String email = sc.next();
		
		String pattern_email = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pattern = Pattern.compile(pattern_email);
		Matcher matches = pattern.matcher(email);
		if(!matches.matches())
			throw new UserException("Enter proper email");
		return matches.matches();
	}
	
	public static boolean validatePno(String phn) throws UserException{
//		String phn = sc.next();
		
		String pattern_phn = "[0-9]{2}\\s[1-9]{1}[0-9]{10}$";
		Pattern pattern = Pattern.compile(pattern_phn);
		Matcher matcher = pattern.matcher(phn);
		if(!matcher.matches())
			throw new UserException("Enter proper phone number");
		return matcher.matches();
	}
	
	public static boolean validatePassword(String password) throws UserException{
//		String password = sc.next();

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