package com.wipro.practiceprograms;
import java.util.Scanner;
public class palindrome 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(n>0)
		{
			sum=(sum*10)+n%10;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("non-palindrome");
		}
	}
}