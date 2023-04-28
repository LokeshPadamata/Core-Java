package regex;
//import java.util.Scanner;
//Java program to validate
//the password using ReGex

import java.util.regex.*;
class PasswordExample{

	// Function to validate the password.
	public static boolean
	isValidPassword(String password)
	{

		// Regex to check valid password.
		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the password is empty
		// return false
		if (password == null) {
			return false;
		}
		// Pattern class contains matcher() method
		// to find matching between given password
		// and regular expression.
		Matcher m = p.matcher(password);

		// Return if the password
		// matched the ReGex
		return m.matches();
	}
	public static void main(String args[])
	{
		
		String str1 = "Geeks@portal20";
		System.out.println(isValidPassword(str1));

		String str2 = "Geeksforgeeks";
		System.out.println(isValidPassword(str2));

		String str3 = "Lokesh@123";
		System.out.println(isValidPassword(str3));

		String str4 = "1234";
		System.out.println(isValidPassword(str4));

		String str5 = "Gfg@20";
		System.out.println(isValidPassword(str5));

		String str6 = "geeks@portal20";
		System.out.println(isValidPassword(str6));
	}
}
	