package com.java;
import java.util.Scanner;
public class PositiveNegavtive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
        int num ;     //Number declaration
        System.out.println("Enter the number you want to cheak..");
        num=sc.nextInt();    //Number Initialization

        if(num>0)
        System.out.println("It is a positive number");
        else if(num<0)
        System.out.println("It is a negative number");
        else
        System.out.println("Neither positive nor negative");
	}

}
