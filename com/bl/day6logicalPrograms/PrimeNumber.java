package com.bl.day6logicalPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int count = 0;
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number you want to check.");
		int input = sc.nextInt(); 
		
		for(int i = 2; i < input; i++) 
		{
			if(input % i == 0) 
			{
				System.out.println("It is not a prime number.");
				count = 0;
				break;
			}
			else 
			{
				count++;
			}
		}
		if(count != 0) 
		{
			System.out.println("It is a prime number.");
		}
		
	}
}
