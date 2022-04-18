package com.wipro.practiceprograms;
import java.util.Scanner;
public class Armstrong 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		int temp=n;
		while(n>0)
		{
			int rem=n%10;
			s=s+(rem*rem*rem);
			n=n/10;
		}
		if(s==temp)
		{
			System.out.println(s+"is armstrong");
		}
		else
		{
			System.out.println(s+"is not an armstrong");
		}
		
	}
}
