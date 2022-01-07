package com.ankita.learning;

import java.util.Scanner;

public class NumberIsPowerOfTwoOrNot {
	public boolean powerOfTwo(int num)
	 {
		
	    while(num%2==0) {
	    	num/=2;
		 }
		 if(num==1){
			 return true;
		 }
		 else{
			 return false;
		 }
	}

	public static void main(String[] args) {
		 NumberIsPowerOfTwoOrNot N=new  NumberIsPowerOfTwoOrNot();
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter a Number: ");
		 int num=scan.nextInt();
		System.out.println(N.powerOfTwo(num ));
	}

}
