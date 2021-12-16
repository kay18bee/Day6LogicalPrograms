package com.bl.day6logicalPrograms;

import java.util.Scanner;

public class Stopwatch {
	
	public static void main(String[] args) {
		
		double start = 0, stop = 0, time = 0;
		
		System.out.println("These are your options: \n 1. Start\n 2. Stop");
		System.out.println("NOTE: Enter 1 to start and 2 to stop the stopwatch.");
		Scanner scanner1 = new Scanner(System.in);
		int answer1 = scanner1.nextInt();
		if(answer1 == 1) {
			start = System.nanoTime();
		}else if(answer1 == 2){
			System.out.println("Please start the watch first.");
		}else {
			System.out.println("Invalid input. Try again.");
		}
		
		Scanner scanner2 = new Scanner(System.in);
		int answer2 = scanner2.nextInt();
		if(answer2 == 2) {
			stop = System.nanoTime();
		}
		time = (stop - start) / 1000000000;
		System.out.println(time + " seconds");	
	}

}
