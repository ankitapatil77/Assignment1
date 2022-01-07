package com.ankita.learning;

public class FibbonicSeries {

	public static void main(String[] args) {
		int num1=0,num2=1;
		int num3;
		int count;
		int n=50;
		
		System.out.println("fibbonic Series 0"  +" :"+  num1); 
		System.out.println("fibbonic Series 1" +" :"+  num2 );
		for(int i=2;i<n;i++) {
			num3=num1+num2;
			num1=num2;
			num2=num3;
			 
			System.out.println("fibbonic Series " +i +" :"+  num3 ); 
		}
		

	}

}
