package com.bl.day6logicalPrograms;

import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of coupons you want.");
		int answer = scanner.nextInt();
		coupon(answer);
	}
	
	public static void coupon(int answer) {
		
		int arr[] = new int[answer + 1];
		for(int i = 1; i <= answer; i++) {
			Random random = new Random();
			int number = random.nextInt(9999);
			
			arr[i] = number;
			System.out.println(arr[i]);
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j])
					System.out.println(arr[j] + "is a duplicate number.");
			}
		}
	}

}
