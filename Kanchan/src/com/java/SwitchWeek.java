package com.java;

import java.util.Scanner;

public class SwitchWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		
		int weekDay = sc.nextInt();
		String day="";
		switch (weekDay)
		{
		case 1:
			 day="sunday";
			 System.out.println("Day is.."+day);
			// break;
		case 2:
			 day="Monday";
			 System.out.println("Day is.."+day);
			// break;
		case 3:
			 day="Tuesday";
			 System.out.println("Day is.."+day);
			// break;
		case 4:
			 day="Wednesday";
			 System.out.println("Day is.."+day);
			// break;
		case 5:
			 day="Theusday";
			 System.out.println("Day is.."+day);
			// break;
		case 6:
			 day="Friday";
			 System.out.println("Day is.."+day);
			// break;
		case 7:
			 day="Shaterday";
			 System.out.println("Day is.."+day);
			// break;
		   default:
		System.out.println("Invalid input..");
			 
			 
		}
		

	}

}
