package com.ankita.learning;
import java.util.Scanner;
import java.util.StringTokenizer;

public class OwnVersionOfSplit {
	public static void main(String[] args) {
		String str;
		System.out.println("Enter a string: ");
		Scanner sc= new Scanner(System.in);
		str=sc.nextLine();
		StringTokenizer st=new StringTokenizer(str);
		while(st.hasMoreTokens()) {
			String token=st.nextToken();
			System.out.println(token);
		
			
		
	}

}


}
