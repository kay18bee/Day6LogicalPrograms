package com.bl.day6logicalPrograms;

import java.util.Scanner;

public class NumberReversal {

	public static void main(String[] args) {
		
		int reverse = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to reverse.");
		int input = sc.nextInt();
		
		while(input != 0)   
		{  
		int remainder = input % 10;  
		reverse = reverse * 10 + remainder;  
		input = input/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		
	}
}
