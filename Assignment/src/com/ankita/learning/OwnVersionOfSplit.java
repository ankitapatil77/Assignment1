package com.ankita.learning;
import java.util.Scanner;
import java.util.StringTokenizer;

public class OwnVersionOfSplit {
	public static void main(String[] args) {
		String str;
		System.out.println("Enter a string: ");
		Scanner sc= new Scanner(System.in);
		str=sc.nextLine();
		System.out.println("enter breaking: ");
		String breakString=sc.nextLine();

        String[] arrOfStr = mySplit(str,breakString); 
         System.out.println("Number of substrings: "+arrOfStr.length);
         
         for(int i=0; i< arrOfStr.length; i++)
         {
             System.out.println("str["+i+"] : "+arrOfStr[i]);
         }
 
    }

	public static String[] mySplit(String str, String breakString) {
		String[]string= str.split(breakString);
		return string;
	} 

			
		
}
