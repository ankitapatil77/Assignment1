package com.ankita.learning;
import java.util.Scanner;
public class Diff_between_SumOf_Squares_and_SquareOf_SumOf_First_Natural_Numbers {

		int sum=0,sqsum=0;
		public int calculateDifference(int N) {
			for(int i=1;i<=N;i++) {
				sum+=i;
			}
			sum=sum*sum;
			for(int i=1;i<=N;i++) {
				sqsum+=(i*i);
				
			}
			return sum-sqsum;
		}

		public static void main(String[] args) {
			Diff_between_SumOf_Squares_and_SquareOf_SumOf_First_Natural_Numbers  D1=new Diff_between_SumOf_Squares_and_SquareOf_SumOf_First_Natural_Numbers ();
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a Number: ");
			int N=scan.nextInt();
			System.out.println(D1.calculateDifference(N));

		}

}


