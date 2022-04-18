package com.wipro.practiceprograms;
import java.util.Scanner;
public class Perfect 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(temp==sum)
		{
			System.out.println("perfect");
		}
		else
		{
			System.out.println("not perfect");
		}
			
	}

}
