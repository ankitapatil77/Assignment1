package com.ankita.learning;

import java.util.Scanner;

public class TrafficLight {
	public static void main(String[] args) {
		String color;

		System.out.println("Enter a color: ");
		Scanner scan=new Scanner(System.in);
		color=scan.nextLine();
		
		switch(color) {
		case "red":
			System.out.println("Stop");
			break;
		case "yellow":
			System.out.println("Ready");
			break;
		case "green":
			System.out.println("Go");
			break;
		default:
			System.out.println("Invalid color");
		}
	
		
	}


}
