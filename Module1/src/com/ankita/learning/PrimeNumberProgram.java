package com.ankita.learning;
import java.util.Scanner;
public class PrimeNumberProgram {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number: ");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		
		boolean flag =false;
		 for(int i=2;i<num/2;++i) { 
			 if(num%i==0)
				 flag=true;
			     break;
		 }
		 if(!flag) {
				
				System.out.println(num+ " is prime number");
		 }
	    else {
	    	System.out.println(num +"  is not prime number ");
	    }
	}
	


}
