package com.wipro.practiceprograms;
import java.util.Scanner;
public class Factorial 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		//using for loop
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial using for loop="+fact);
		//using while loop
		int fact1=1;
		while(n>0)
		{
			fact1=fact1*n;
			n--;
		}
		System.out.println("factorial using while loop="+fact1);
	}
}