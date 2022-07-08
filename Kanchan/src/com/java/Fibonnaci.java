package com.java;
import java.util.Scanner;
public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
      
		int t1 = 1, t2 = 2;
        System.out.print("Enter the number of terms: ");
       
        int n=sc.nextInt();   //Declare and Initialize the number of terms
        System.out.println("First " + n + " terms of fibonnaci series: ");
        //Print the fibonacci series
       
        
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }


	}

}
