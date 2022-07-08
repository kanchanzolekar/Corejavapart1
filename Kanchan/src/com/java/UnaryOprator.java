package com.java;

import java.util.Scanner;

public class UnaryOprator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a  b and c");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		
		
		if(a>b && a>c)
		{
			System.out.println("a is max.." +a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is max.."+c);
		}
		else
		{
			System.out.println( "c is max.."+b);
		}
		
		
	}

}
