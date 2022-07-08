package com.java;
import java.util.Scanner;
public class OnePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
int i,j,n,count=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE Number");
		
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(count+"  ");
				count++;
			}
			System.out.println("");
		}
		

	}

}
