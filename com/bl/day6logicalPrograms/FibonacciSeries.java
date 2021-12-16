package com.bl.day6logicalPrograms;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {

		System.out.println("How long do you want the resulting fibonacci series to be? ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		int num1 = 0, num2 = 1;
		
		System.out.print(num1 + " " + num2);
		
		for(int i = 2; i < input; ++i) 
		{
			int num3 = num1 + num2;
			System.out.print(" " + num3 );
			
			num1 = num2;
			num2 = num3;
		}
		
	}

}
