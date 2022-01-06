package com.ankita.learning;
import java.util.Scanner;
public class PalindromExample {
	public static void main(String[] args) {
		String string, reverseStr = "";
	    System.out.println("Enter a String: ");
	    Scanner scan=new Scanner(System.in);
	    string=scan.nextLine();
	    
	    int strLength = string.length();

	    for (int index = (strLength - 1); index>=0; --index) {
	      reverseStr = reverseStr + string.charAt(index);
	      
	    }

	    if (string.equals(reverseStr)) {
	      System.out.println(string + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(string + " is not a Palindrome String.");
	     
	    }
	}


}
