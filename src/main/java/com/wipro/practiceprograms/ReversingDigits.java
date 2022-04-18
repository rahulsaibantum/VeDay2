package com.wipro.practiceprograms;
import java.util.Scanner;
public class ReversingDigits
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp1=0;
		for(temp1=0;n!=0;n=n/10)
		{
			int rem1=n%10;
			temp1=(temp1*10)+rem1;
		}
		System.out.println("After Reversing ="+temp1);
	}
}
