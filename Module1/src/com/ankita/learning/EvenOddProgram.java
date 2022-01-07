package com.ankita.learning;
import java.util.Scanner;
public class EvenOddProgram {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter number: ");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		
		if(num%2==0) {
			System.out.println(num + " is Even number");
		}
		else {
			System.out.println(num+ " is odd number");
		}
		
	}

}
