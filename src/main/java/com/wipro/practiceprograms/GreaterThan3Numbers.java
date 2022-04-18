package com.wipro.practiceprograms;
import java.util.Scanner;
public class GreaterThan3Numbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 3 numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if(n1==n2&&n2==n3)
		{
			System.out.println("All are equal");
		}
		else if(n1>n2&&n1>n3)
		{
			System.out.println(n1+" "+"is greater");
		}
		else if(n2>n3)
		{
			System.out.println(n2+" "+"is greater");
		}
		else
		{
			System.out.println(n3+" "+"is greater");
		}
	}
}
			

