package com.ankita.learning;

import java.util.Scanner;

public class CheckIncreasingNumber {
	
		public void checkNumber() {
			int num;
			boolean flag = false;
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a number: ");
			num=scan.nextInt();
			int currentNumber = num % 10;
			num=num/10;
			
			while(num>0) {
				if(currentNumber<=num%10) {
					flag=true;
					break;
				}
				currentNumber=num%10;
				num=num/10;
			}
			if(flag) {
				System.out.println("Number not increasing");
			}
			else {
				System.out.println("Number is increasing");
			}
		}

		public static void main(String[] args ) {
			CheckIncreasingNumber Cn = new CheckIncreasingNumber();
			Cn.checkNumber();

		}

	}


