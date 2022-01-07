package com.ankita.learning;
import java.util.Scanner;
public class FactorialProgram {
	public static void main(String[] args) {
		int number;
		Scanner scan= new Scanner(System.in);
	    System.out.println("Enter a number : ");
	    number= scan.nextInt();
	    int fact_var=1;
	   for(int i=1;i<=number;i++) {
		   //formula to calculate factorial
	    	fact_var= fact_var * i;
	    }
	   
	  System.out.println("Factorial of number "+number+" is: "+ fact_var);

		
	}
	
	
	

}
