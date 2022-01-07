package com.ankita.learning;

import java.util.Scanner;

public class NaturalNumberDivisibleBy3Or5 {
	int sum=0;
	int num;
	public void calculatesum() {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=scan.nextInt();
		//check number is divisible by 3 or 5 
		  for(int i=1;i<=num;i++) {
			  if(num%3==0 && num%5==0) {
				  sum =sum+i;
				}
			  
		  }
		  System.out.println("sum: "+sum);
	
	}
	public static void main(String[] args) {
		NaturalNumberDivisibleBy3Or5  N  =new NaturalNumberDivisibleBy3Or5 ();
		N.calculatesum();
		
	}
	

}


