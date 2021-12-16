package com.bl.day6logicalPrograms;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String[] args) {
	
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number you want to check.");
		int input = sc.nextInt();
		
		int i=1;  
		System.out.println("Divisors are: ");

		while(i <= input/2)  
		{  
			if(input % i == 0)  
			{  
				System.out.println(i);
				sum = sum + i;  
			} 
		i++;  
		}
		if(sum==input)  
		{  
			System.out.println(input+" is a perfect number.");  
		} 
		else  
		{
			System.out.println(input+" is not a perfect number.");   
		}
	
	}  
	
}


