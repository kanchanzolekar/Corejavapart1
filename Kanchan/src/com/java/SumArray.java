package com.java;
import java.util.Scanner;
public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,sum=0;
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter no of element you want in array");
		 n=sc.nextInt();
		 int a[]=new int[n];
		 
		 System.out.println("enter the array element");
		 for (i=0;i<n;i++)
		 {
			 a[i]=sc.nextInt();
			 sum=sum+a[i];
			 
		 }
		 System.out.println("sum"+sum);
				

	}

}
