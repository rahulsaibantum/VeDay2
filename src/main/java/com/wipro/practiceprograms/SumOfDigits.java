package com.wipro.practiceprograms;
import java.util.Scanner;
public class SumOfDigits
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum1;
		for(sum1=0;n!=0;n=n/10)
		{
			sum1+=n%10;
		}
		System.out.println("sum of it's digits="+sum1);
		
	}
}